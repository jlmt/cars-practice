package com.iteso.utpractice.engines.impl;

import com.iteso.utpractice.engines.iEngine;
import com.iteso.utpractice.gastanks.iGasTank;

/**
 * Created with IntelliJ IDEA.
 * User: rvillalobos
 * Date: 9/3/13
 * Time: 1:06 PM
 * To change this template use File | Settings | File Templates.
 */
public class TFSI4 implements iEngine {
    private iGasTank gasTank;


    public float getGas() {
        float myGasLevel = getGasTank().getGasLevel();
        return myGasLevel;
    }


    public void setGas(float gas) {
        getGasTank().addGas(gas);
    }


    public iGasTank getGasTank() {
        return gasTank;
    }


    public void setGasTank(iGasTank gasTank) {
        this.gasTank = gasTank;
    }


    @Override
    public int start(){
        float currentGas = getGas();
        if (currentGas > 0)
            return 1;
        else if (currentGas == 0)
            return 0;
        else {
            System.out.println("Impossible to get gas lecture");
            return -1;
        }
    }
}
