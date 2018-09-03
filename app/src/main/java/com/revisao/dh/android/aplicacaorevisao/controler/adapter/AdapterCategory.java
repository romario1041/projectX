package com.revisao.dh.android.aplicacaorevisao.controler.adapter;

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
import com.revisao.dh.android.aplicacaorevisao.model.ModelTemp;

import java.util.List;

public class AdapterCategory extends RecyclerView.Adapter<AdapterCategory.ViewHolder> {

    List<ModelTemp> modelTempListl;
    Context context;
    ClickListener clickListener;

    public AdapterCategory(List<ModelTemp> modelTempListl, Context context){
        this.modelTempListl = modelTempListl;
        this.context = context;
    }
    @NonNull
    @Override
    public AdapterCategory.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflate = LayoutInflater.from(parent.getContext());
        return new ViewHolder(inflate.inflate(R.layout.item_recycler_category, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AdapterCategory.ViewHolder holder, int position) {
            ModelTemp modelTemp = modelTempListl.get(position);
            holder.bind(modelTemp.getTitle(), modelTemp.getImage(), modelTemp.getContent());
    }

    @Override
    public int getItemCount() {
        return modelTempListl.size();
    }

    public void setClickListener(ClickListener clickListener) {
        this.clickListener = clickListener;
    }

    public class ViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener {

        TextView title;
        ImageView imageView;
        TextView content;

        public ViewHolder(View itemView) {
            super(itemView);
            this.title = itemView.findViewById(R.id.titleTextView);
            this.imageView = itemView.findViewById(R.id.image);
            this.content = itemView.findViewById(R.id.content);
            itemView.setTag(itemView);
            itemView.setOnClickListener(this);

        }
        public void bind(String title, String imagemView, String content){
            this.title.setText(title);
            this.imageView.setImageResource(getImageDrawableResId(imagemView));
            this.content.setText(content);
        }

        public int getImageDrawableResId(String imageId ){
            Resources resources = context.getResources();
            return resources.getIdentifier(imageId, "drawable", context.getPackageName());
        }

        @Override
        public void onClick(View v) {
                if (clickListener != null) clickListener.onClick(v, getAdapterPosition());
        }
    }
}
