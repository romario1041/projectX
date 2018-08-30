package com.revisao.dh.android.aplicacaorevisao.model;

public class Category {

    String category;
    String image;

    public Category(String category, String image) {
        this.category = category;
        this.image = image;
    }


    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
