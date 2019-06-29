package com.example.melhoridadeapp;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class FornecedoresAdapter extends RecyclerView.Adapter<FornecedoresAdapter.ViewHolder> {

    private ArrayList<Fornecedor> mFornecedores;
    private OnItemClickListener mListernet;

    public FornecedoresAdapter(ArrayList<Fornecedor> fornecedors)
    {
        mFornecedores = fornecedors;
    }

    public interface OnItemClickListener {
        void onItemClick(int position);
    }

    public void setOnItemClickListerner(OnItemClickListener listerner)
    {
        mListernet = listerner;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.lista_de_fazedores_de_servico, viewGroup, false);
        ViewHolder vh = new ViewHolder(v, mListernet);
        return vh;

    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder viewHolder, int i) {
        Fornecedor fornecedorAtual = mFornecedores.get(i);

        viewHolder.mImageView.setImageResource(fornecedorAtual.getmImageResource());
        viewHolder.mTextView1.setText(fornecedorAtual.getmText1());
        viewHolder.mTextView2.setText(fornecedorAtual.getmText2());
    }

    @Override
    public int getItemCount() {
        return mFornecedores.size();
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        public ImageView mImageView;
        public TextView mTextView1;
        public TextView mTextView2;

        public ViewHolder(@NonNull View itemView, final OnItemClickListener listener) {
            super(itemView);
            mImageView = itemView.findViewById(R.id.imageView);
            mTextView1 = itemView.findViewById(R.id.textView);
            mTextView2 = itemView.findViewById(R.id.textView2);

            itemView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    if (listener != null)
                    {
                        int position = getAdapterPosition();
                        if (position != RecyclerView.NO_POSITION)
                        {
                            listener.onItemClick(position);
                        }
                    }
                }
            });
        }
    }


}
