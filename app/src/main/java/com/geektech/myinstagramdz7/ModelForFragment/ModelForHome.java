package com.geektech.myinstagramdz7.ModelForFragment;

public class ModelForHome {

    private String title, data;
    private int image;

    public ModelForHome(String title, String data, int image) {
        this.title = title;
        this.data = data;
        this.image = image;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }
}
