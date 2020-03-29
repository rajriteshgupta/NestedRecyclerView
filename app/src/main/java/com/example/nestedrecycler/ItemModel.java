package com.example.nestedrecycler;

import android.widget.ImageView;

public class ItemModel {
    ImageView image;

    public ItemModel() {
    }

    public ItemModel(ImageView image) {
        this.image = image;
    }

    public ImageView getImage() {
        return image;
    }

    public void setImage(ImageView image) {
        this.image = image;
    }
}
