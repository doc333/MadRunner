package com.example.lmd2.madrunner;

import android.app.Activity;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.AnimationSet;
import android.view.animation.TranslateAnimation;

/**
 * Created by LMD2 on 09/07/2015.
 */
public class Game {
    private int score = 0;
    private Runner runner;
    private Activity activity;

    public Game(Activity activity, Runner runner) {
        this.activity = activity;
        this.runner = runner;
    }

    public Activity getActivity() {
        return activity;
    }

    public void setActivity(Activity activity) {
        this.activity = activity;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Runner getRunner() {
        return runner;
    }

    public void setRunner(Runner runner) {
        this.runner = runner;
    }

    public void play() {
        Decor grass = new Decor(getActivity(), 0, 0, R.id.imageViewGrass, 5000);
        grass.moove();
        Decor green_tree = new Decor(getActivity(), 0, 0, R.id.imageViewGreenTree, 6000);
        green_tree.moove();
        Decor abstract_tree = new Decor(getActivity(), 0, 0, R.id.imageViewAbstractTree, 7000);
        abstract_tree.moove();
        Decor bird = new Decor(getActivity(), 0, 0, R.id.imageViewBird, 6000);
        bird.moove();
        Decor cloud = new Decor(getActivity(), 0, 0, R.id.imageViewCloud, 10000);
        cloud.moove();
    }
}
