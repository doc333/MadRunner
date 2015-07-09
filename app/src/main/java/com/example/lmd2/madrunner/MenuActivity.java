package com.example.lmd2.madrunner;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by admin on 09/07/2015.
 */
public class MenuActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_menu);
    }

    public void startGame(View view)
    {
        Intent intent = new Intent(MenuActivity.this, FullscreenActivity.class);
        startActivity(intent);
    }

    public void quitGame(View view)
    {
        finish();
        System.exit(0);
    }
}
