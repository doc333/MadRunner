package com.example.lmd2.madrunner;

import android.widget.ImageView;

/**
 * Created by LMD2 on 09/07/2015.
 */
public class Element {
    private float positionX;
    private float positionY;
    private int imageId;

    public Element() {this(0, 0, 0);}
    public Element(float positionX, float positionY, int imageId) {
        this.positionX = positionX;
        this.positionY = positionY;
        this.imageId = imageId;
    }

    public float getPositionX() {
        return positionX;
    }

    public void setPositionX(float positionX) {
        this.positionX = positionX;
    }

    public float getPositionY() {
        return positionY;
    }

    public void setPositionY(float positionY) {
        this.positionY = positionY;
    }

    public int getImageId() {
        return imageId;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }
}
