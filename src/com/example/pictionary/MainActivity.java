package com.example.pictionary;

import android.widget.EditText;
import android.content.Intent;
import android.view.View;
import com.example.pictionary.R;
import com.example.pictionary.R.layout;
import com.example.pictionary.R.menu;
import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

/**
 * // -------------------------------------------------------------------------
 * /** The main activity serves as the landing screen for the Pictionary app. It
 * requests the player to input how many players will be in the game, and it
 * also has a start button to begin the game and call the drawActivty.
 *
 *  @author Pictionary Team (Chris Deisher, Edward McEnrue, Michael Liu)
 *  @version Apr 16, 2014
 */

public class MainActivity
    extends Activity
{

    private DrawingView        drawView;

    // The key value pair to send the player amount to DrawActivity
    public final static String EXTRA_MESSAGE = "com.example.myfirstapp.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Getting the button to start the draw activity and pass player amt info
// below

    public void startDrawing(View view)
    {
        // Build an intent and the key value pair in response to the button.

        Intent intent = new Intent(this, DrawActivity.class);

        EditText editText = (EditText)findViewById(R.id.playerAmount);
        String playerAmount = editText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, playerAmount);
        startActivity(intent);
    }

}
