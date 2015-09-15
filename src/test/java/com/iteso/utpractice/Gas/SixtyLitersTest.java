package com.iteso.utpractice.Gas;

import com.iteso.utpractice.gastanks.impl.SixtyLiters;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;


/**
 * Created by jose luis on 14/09/2015.
 */
public class SixtyLitersTest {
    SixtyLiters myTank;
    double myGas;


    @Before
    public void setUp(){
        myTank = new SixtyLiters();
        myTank.setGasLevel(30);
    }


    @Test
    public void testAddSomeGas(){
        myTank.addGas(10);
        myGas = myTank.getGasLevel();
        assertEquals((double)58, myGas, 0);
    }




    @Test
    public void testAddToFullTank(){
        myTank.addGas(10);
        myGas = myTank.getGasLevel();
        assertEquals((double)60, myGas, 0);
    }


    @Test
    public void testAddALotOfGas(){
        myTank.addGas(49);
        myGas = myTank.getGasLevel();
        assertEquals((double)60, myGas, 0);
    }


    @Test
    public void testAddNegativeGas(){
        myTank.addGas(-1);
        myGas = myTank.getGasLevel();
        assertEquals((double) 49, myGas, 0);
    }


}
