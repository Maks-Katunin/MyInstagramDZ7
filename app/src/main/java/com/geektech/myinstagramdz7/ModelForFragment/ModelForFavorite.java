package com.geektech.myinstagramdz7.ModelForFragment;

public class ModelForFavorite {
    private int oval, liked, photo;

    public ModelForFavorite(int oval, int liked, int photo) {
        this.oval = oval;
        this.liked = liked;
        this.photo = photo;
    }

    public int getOval() {
        return oval;
    }

    public void setOval(int oval) {
        this.oval = oval;
    }

    public int getLiked() {
        return liked;
    }

    public void setLiked(int liked) {
        this.liked = liked;
    }

    public int getPhoto() {
        return photo;
    }

    public void setPhoto(int photo) {
        this.photo = photo;
    }
}
