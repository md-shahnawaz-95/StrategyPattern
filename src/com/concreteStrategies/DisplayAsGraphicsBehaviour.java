package com.concreteStrategies;

import com.strategies.IDisplayBehaviour;

public class DisplayAsGraphicsBehaviour implements IDisplayBehaviour{

    @Override
    public void display(String name) {
        System.out.println("I am a "+ name + ", I am getting displayed Graphically!!!");
        
    }
    
}