package com.example.lmd2.madrunner;

import java.util.Random;

/**
 * Created by LMD2 on 09/07/2015.
 */
public class Decor extends Element {

    private static int imageIds[] = {};

    public Decor(float positionX, float positionY) {
        int id = (int)(Math.random() * this.imageIds.length);
        super(positionX, positionY, imageIds[id]);
    }
}
