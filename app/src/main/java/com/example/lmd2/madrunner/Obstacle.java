package com.example.lmd2.madrunner;

import android.app.Activity;

/**
 * Created by LMD2 on 09/07/2015.
 */
public class Obstacle extends Element {
    private float hitBox[];

    private static int imageIds[] = {};

    public Obstacle(Activity activity, float positionX, float positionY, float[] hitBox) {
        super(activity, positionX, positionY, 0);
        int id = (int)(Math.random() * this.imageIds.length);
        this.setImageViewId(imageIds[id]);
        this.hitBox = hitBox;
    }

    public float[] getHitBox() {
        return hitBox;
    }

    public void setHitBox(float[] hitBox) {
        this.hitBox = hitBox;
    }
}
