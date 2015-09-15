package com.iteso.utpractice.gastanks.impl;

import com.iteso.utpractice.gastanks.iGasTank;

/**
 * Created by jose luis on 08/09/2015.
 */
public class FortyLiters implements iGasTank {
    private float gasLevel;
    private final int MAX_GAS_LEVEL = 40;




    public float getGasLevel(){
        return gasLevel;
    }


    public int getTankCapacity(){
        return MAX_GAS_LEVEL;
    }



    public void setGasLevel(float liters){
        this.gasLevel = gasLevel;
    }


    public void addGas(float liters){
        float total;


        if(getGasLevel() < getTankCapacity()) {
            total = getGasLevel() + liters;
            if (total > getTankCapacity()) {
                gasLevel = getTankCapacity() - getGasLevel();
            } else
                gasLevel += liters;
        }
    }


}