package com.stratergyPattern;

import com.strategies.IDisplayBehaviour;
import com.strategies.IFlyBehaviour;
import com.strategies.IQuackBehaviour;

public class Duck {
    IFlyBehaviour iFlyBehaviour;
    IQuackBehaviour iQuackBehaviour;
    IDisplayBehaviour iDisplayBehaviour;

    public Duck(IFlyBehaviour iFlyBehaviour, IQuackBehaviour iQuackBehaviour, IDisplayBehaviour iDisplayBehaviour){
        this.iFlyBehaviour = iFlyBehaviour;
        this.iQuackBehaviour = iQuackBehaviour;
        this.iDisplayBehaviour = iDisplayBehaviour;
    }

    public void fly(){
        this.iFlyBehaviour.fly();
    }

    public void quack(){
        this.iQuackBehaviour.quack();
    }

    public void display(String name){
        this.iDisplayBehaviour.display(name);
    }

}
