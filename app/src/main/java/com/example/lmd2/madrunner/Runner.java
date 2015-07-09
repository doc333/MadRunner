package com.example.lmd2.madrunner;

import android.widget.ImageView;

/**
 * Created by LMD2 on 09/07/2015.
 */
public class Runner extends Element {
    private float hitBox[];

    public Runner(float positionX, float positionY, int imageId, float[] hitBox) {
        super(0, 50, R.mipmap.runner);
        this.hitBox = hitBox;
    }

    public void jump() {

    }
}
