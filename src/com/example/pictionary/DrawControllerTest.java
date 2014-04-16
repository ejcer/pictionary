package com.example.pictionary;

import junit.framework.TestCase;

public class DrawControllerTest
    extends TestCase
{
    DrawController draw;


    public void setup()
    {
        // does setup
        draw = new DrawController("Name");
    }


    public void testgetScore()
    {
        assertEquals(draw.getScore(), -1);
    }
}
