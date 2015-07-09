package com.example.lmd2.madrunner;

/**
 * Created by LMD2 on 09/07/2015.
 */
public class Game {
    private int score = 0;
    private Runner runner;

    public Game(int score, Runner runner) {
        this.score = score;
        this.runner = runner;
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

    }
}
