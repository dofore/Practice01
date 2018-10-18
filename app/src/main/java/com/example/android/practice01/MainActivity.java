package com.example.android.practice01;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // setContentView(R.layout.activity_main);

        gameView = new GameView(this);
        setContentView(gameView);

        /**
         LinearLayout linearLayout = new LinearLayout(this);
         linearLayout.setOrientation(LinearLayout.VERTICAL);
         setContentView(linearLayout);
         linearLayout.addView(new Screen(this));

         */
    }
}
