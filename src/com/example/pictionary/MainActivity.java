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
 * @author Pictionary Team (Chris Deisher, Edward McEnrue, Michael Liu)
 * @version Apr 16, 2014
 */

public class MainActivity
    extends Activity
{



    // The key value pair to send the player amount to DrawActivity
    public final static String PLAYER_AMOUNT = "com.Pictionary.MainActivity.MESSAGE";


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }


    // Getting the button to start the draw activity and pass player amt info
    // below:

    /**
     * Listens for the startDrawing button to be clicked, and if the editText
     * has information entered, then the DrawActivity activity will be called
     * with the player amount data passed through an intent.
     *
     * @param view
     *            The button view named "startDrawing."
     */
    public void startDrawing(View view)
    {
        // Build an intent and the key value pair in response to the button.

        Intent mainIntent = new Intent(this, DrawActivity.class);

        EditText editText = (EditText)findViewById(R.id.playerAmount);

        if (!editText.getText().toString().equals(""))
        {
            String playerAmount = editText.getText().toString();
            mainIntent.putExtra(PLAYER_AMOUNT, playerAmount);

            startActivity(mainIntent);
        }

        // TODO Implement an else statement here to tell the user to enter a
        // player amount. Possibly with a toast notification.
    }

    // TODO Check if the static strings being passed should have a different
    // thing than, "com.Pictionary.ActivityName here.MESSAGE"

    // TODO Should we hardcode our string values into the @string resource?
}
