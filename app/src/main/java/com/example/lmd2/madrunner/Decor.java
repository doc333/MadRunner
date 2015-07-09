package com.example.lmd2.madrunner;

import android.app.Activity;

/**
 * Created by LMD2 on 09/07/2015.
 */
public class Decor extends Element {

    private static int imageIds[] = {};

    public Decor(Activity activity, float positionX, float positionY) {
        super(activity, positionX, positionY, 0);
        int id = (int)(Math.random() * this.imageIds.length);
        this.setImageViewId(imageIds[id]);
    }
}
