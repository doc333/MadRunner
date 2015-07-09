package com.example.lmd2.madrunner;

/**
 * Created by LMD2 on 09/07/2015.
 */
public class Obstacle extends Element {
    private float hitBox[];

    private static int imageIds[] = {};

    public Obstacle(float positionX, float positionY, float[] hitBox) {
        int id = (int)(Math.random() * this.imageIds.length);
        super(positionX, positionY, imageIds[id]);
        this.hitBox = hitBox;
    }
    
    public float[] getHitBox() {
        return hitBox;
    }

    public void setHitBox(float[] hitBox) {
        this.hitBox = hitBox;
    }
}
