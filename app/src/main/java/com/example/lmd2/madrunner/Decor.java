package com.example.lmd2.madrunner;

import android.app.Activity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.CycleInterpolator;
import android.view.animation.LinearInterpolator;
import android.view.animation.TranslateAnimation;

/**
 * Created by LMD2 on 09/07/2015.
 */
public class Decor extends Element {

    int vitesse;

    public Decor(Activity activity, float positionX, float positionY, int imageId, int vitesse) {
        super(activity, positionX, positionY, 0);
        this.setImageViewId(imageId);
        this.vitesse = vitesse;
    }

    public int getVitesse() {
        return vitesse;
    }

    public void setVitesse(int vitesse) {
        this.vitesse = vitesse;
    }

    public void moove(){
        View decor = getActivity().findViewById(getImageViewId());;

        AnimationSet s = new AnimationSet(false);
        s.setDuration(getVitesse());
        TranslateAnimation translation;

        translation = new TranslateAnimation(0f, -4000, 0f, 0F);
        translation.setRepeatCount(-1);
        translation.setRepeatMode(translation.RESTART);

        translation.setInterpolator(new LinearInterpolator());

        s.addAnimation(translation);

        decor.startAnimation(s);
    }
}
