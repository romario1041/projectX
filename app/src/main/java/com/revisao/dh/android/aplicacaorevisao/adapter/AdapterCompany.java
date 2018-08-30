package com.revisao.dh.android.aplicacaorevisao.adapter;

import android.content.Context;
import android.content.res.Resources;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.revisao.dh.android.aplicacaorevisao.R;
import com.revisao.dh.android.aplicacaorevisao.helpers.ClickListener;
import com.revisao.dh.android.aplicacaorevisao.model.ModelCompany;

import java.util.List;

public class AdapterCompany extends RecyclerView.Adapter<AdapterCompany.ViewHolder> {

    List<ModelCompany> words;
    Context context;
    ClickListener clickListener;

    public AdapterCompany(List<ModelCompany> words, Context context){
        this.words = words;
        this.context = context;
    }

    @NonNull
    @Override
    public AdapterCompany.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflate = LayoutInflater.from(parent.getContext());
        return new ViewHolder(inflate.inflate(R.layout.item_recycler_company, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCompany.ViewHolder holder, int position) {
        ModelCompany modelCompany = words.get(position);
        holder.bind(modelCompany.getTitle(), modelCompany.getImage());
    }

    @Override
    public int getItemCount() {
        return words.size();
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{

        TextView title;
        ImageView imageView;

        public ViewHolder(View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.titleTextView);
            this.imageView = itemView.findViewById(R.id.image);
            itemView.setTag(itemView);
            itemView.setOnClickListener(this);
        }

        public int getImageDrawableResId(String imageId ){
            Resources resources = context.getResources();
            return resources.getIdentifier(imageId, "drawable", context.getPackageName());
        }

        public void bind(String title, String imagemView){
            this.title.setText(title);
            this.imageView.setImageResource(getImageDrawableResId(imagemView));

        }

        @Override
        public void onClick(View v) {
            if (clickListener != null) clickListener.onClick(v, getAdapterPosition());
        }
    }
}
