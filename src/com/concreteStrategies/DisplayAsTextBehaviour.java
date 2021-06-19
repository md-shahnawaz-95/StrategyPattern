package com.concreteStrategies;

import com.strategies.IDisplayBehaviour;

public class DisplayAsTextBehaviour implements IDisplayBehaviour{

    @Override
    public void display(String name) {
        System.out.println("I am "+ name + ", I am getting displayed as a text!!!");
        
    }
    
}
