package com.example.pictionary;

import android.widget.EditText;
import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * // -------------------------------------------------------------------------
 * /** The draw activity is used to create a canvas for the player to draw their
 * picture. This activity is called multiple times throughout the game, but it
 * is first called by the start screen, and it instantiates the game with a
 * player amount from the first MainActivity.
 *
 *  @author Pictionary Team (Chris Deisher, Edward McEnrue, Michael Liu)
 *  @version Apr 16, 2014
 */
public class DrawActivity
    extends Activity
{

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_draw);

        // Get the player amount from the incoming intent key value data.
        Intent intent = getIntent();
        String playerAmount = intent.getStringExtra(MainActivity.EXTRA_MESSAGE);
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu)
    {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.draw, menu);
        return true;
        //DrawView drawView = (DrawView)findViewById(R.id.playerAmount); How do I add this Michael??
    }

}
