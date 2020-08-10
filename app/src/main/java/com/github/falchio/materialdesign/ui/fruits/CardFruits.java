package com.github.falchio.materialdesign.ui.fruits;

public class CardFruits {
    private String title;
    private String description;
    private int imageID;

    public CardFruits(String title, String description, int imageID) {
        this.title = title;
        this.description = description;
        this.imageID = imageID;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return description;
    }

    public int getImageID() {
        return imageID;
    }
}
