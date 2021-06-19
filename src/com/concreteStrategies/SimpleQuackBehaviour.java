package com.concreteStrategies;

import com.strategies.IQuackBehaviour;

public class SimpleQuackBehaviour implements IQuackBehaviour{

    @Override
    public void quack() {
        System.out.println("I quack simply!!!");
        
    }
    
}
