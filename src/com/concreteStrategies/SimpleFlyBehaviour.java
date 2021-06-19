package com.concreteStrategies;

import com.strategies.IFlyBehaviour;

public class SimpleFlyBehaviour implements IFlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I fly simply!!!");
        
    }
    
}