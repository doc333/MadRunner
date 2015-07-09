package com.example.lmd2.madrunner;

import android.app.Activity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;
import android.widget.ImageView;

/**
 * Created by LMD2 on 09/07/2015.
 */
public class Runner extends Element {
    private float hitBox[];

    public Runner(Activity activity, int imageId, float[] hitBox) {
        super(activity, 0, 50, R.mipmap.runner);
        this.hitBox = hitBox;
    }

    public void jump() {
        View runner = getActivity().findViewById(R.id.runner_content);

        AnimationSet s = new AnimationSet(false);
        s.setDuration(900);
        TranslateAnimation translation;

        translation = new TranslateAnimation(0f, 0F, 0f, -1000);
        translation.setFillAfter(true);

        translation.setInterpolator(new AccelerateDecelerateInterpolator());


        TranslateAnimation translation2;

        translation2 = new TranslateAnimation(0f, 0F, 0f, 1000);
        translation2.setFillAfter(true);

        translation2.setInterpolator(new AccelerateInterpolator());

        s.addAnimation(translation);
        s.addAnimation(translation2);

        runner.startAnimation(s);
    }
}
