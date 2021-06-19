package com.concreteStrategies;

import com.strategies.IFlyBehaviour;

public class JetFlyBehaviour implements IFlyBehaviour {

    @Override
    public void fly() {
        System.out.println("I fly like a jet!!!");
        
    }
    
}
