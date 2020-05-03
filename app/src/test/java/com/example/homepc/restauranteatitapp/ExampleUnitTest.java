package com.example.homepc.restauranteatitapp;

import org.junit.Test;


import static org.junit.Assert.*;


public class ExampleUnitTest
{
    @Test
    public void addition_isCorrect() throws Exception
    {
        assertEquals(4, 2 + 2);
    }

    @Test public void mainActivity_shouldNotBeNull() throws Exception
    {
        MainActivity mainActivity = new MainActivity();
        assertNotNull(mainActivity);
    }
    @Test //This is executed after the @Test executes
    public void tearDown()
    {
        System.out.println("Done with testing");
    }

}