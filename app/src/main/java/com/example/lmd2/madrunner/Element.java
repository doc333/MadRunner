package com.example.lmd2.madrunner;

import android.app.Activity;
import android.widget.ImageView;

/**
 * Created by LMD2 on 09/07/2015.
 */
public class Element {
    private Activity activity;
    private float positionX;
    private float positionY;
    private int imageViewId;

    public Element() {this(new Activity(), 0, 0, 0);}
    public Element(Activity activity, float positionX, float positionY, int imageViewId) {
        this.activity = activity;
        this.positionX = positionX;
        this.positionY = positionY;
        this.imageViewId = imageViewId;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
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

    public int getImageViewId() {
        return imageViewId;
    }

    public void setImageViewId(int imageViewId) {
        this.imageViewId = imageViewId;
    }
}
