package com.revisao.dh.android.aplicacaorevisao.model;

public class ModelTemp {

    String title;
    String content;
    String image;

    public ModelTemp(String title, String image, String content){
        this.title = title;
        this.image = image;
        this.content = content;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getImage() {
        return image;
    }

    public void setImage(String image) {
        this.image = image;
    }
}
