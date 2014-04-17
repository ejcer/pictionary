package com.example.pictionary;

import java.util.ArrayList;

/**
 * // -------------------------------------------------------------------------
 * /** Controls all information that must stay consistent throughout a game
 * 
 * @author (cdd5) Chris
 * @author Edward McEnrue
 * @author Michael Liu
 * @version Apr 16, 2014
 */
public class GameController
{
    ArrayList<Integer> scorelist;
    ArrayList<String>  namelist;


    /**
     * sets up our game controller with the correct number of players
     */
    public GameController(int numplayers)
    {
        scorelist = new ArrayList<Integer>(numplayers);
        namelist = new ArrayList<String>(numplayers);

    }


    /**
     * gets number of players
     * 
     * @return numplayers
     */
    public int getNumPlayers()
    {
        return scorelist.size();
    }


    /**
     * returns an ArrayList of everyones scores
     * 
     * @param playernum
     *            is the player's number you want the score of;
     * @return score
     */
    public int getScore(int playernum)
    {
        return scorelist.get(playernum);
    }


    /**
     * set the name for the player
     */
    public void setPlayerName(int playernum, String name)
    {
        namelist.set(playernum - 1, name);
    }


    /**
     * @return the players name
     * @param playernum
     *            the positional number of the player
     */
    public String getPlayerName(int playernum)
    {
        return namelist.get(playernum - 1);
    }


    /**
     * tells you if the round/game is won yet
     * 
     * @return value
     */
    public boolean isWon()
    {
        return false;
    }


    /**
     * sets the score
     * 
     * @param playernum
     *            the players number
     * @param score
     *            the score to add
     */
    public void setScore(int playernum, int score)
    {
        scorelist.set(playernum, score);
    }

}
