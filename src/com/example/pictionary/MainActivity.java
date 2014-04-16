package com.example.pictionary;

import android.view.View;
import com.example.pictionary.R;
import com.example.pictionary.R.layout;
import com.example.pictionary.R.menu;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
    private DrawingView drawView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
