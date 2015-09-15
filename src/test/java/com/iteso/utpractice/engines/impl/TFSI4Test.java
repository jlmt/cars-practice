package com.iteso.utpractice.engines.impl;


import com.iteso.utpractice.gastanks.iGasTank;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;


/**
 * Created by rvillalobos on 9/15/14.
 */
public class TFSI4Test {
    TFSI4 myEngine;
    iGasTank myTank;
    int started;


    @Before
    public void setUp(){
        myEngine = new TFSI4();
        myTank = mock(iGasTank.class);
        myEngine.setGasTank(myTank);
        started = 0;
    }


    @Test
    public void testEngineStartTrue(){
        when(myTank.getGasLevel()).thenReturn((float) 10);

        started = myEngine.start();


        assertEquals(1, started);


    }


    @Test
    public void testEngineStartFalse(){
        when(myTank.getGasLevel()).thenReturn((float) 0);


        started = myEngine.start();


        assertEquals(0, started);


    }

    @Test
    public void testEngineStartInvalid(){
        when(myTank.getGasLevel()).thenReturn((float) -1);


        started = myEngine.start();


        assertEquals(-1, started);


    }


} 