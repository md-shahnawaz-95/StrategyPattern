package com.concreteStrategies;

import com.strategies.IQuackBehaviour;

public class NoQuackBehaviour implements IQuackBehaviour{

    @Override
    public void quack() {
        System.out.println("I do not quack!!!");
        
    }
    
}
