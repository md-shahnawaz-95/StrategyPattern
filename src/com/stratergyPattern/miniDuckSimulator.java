package com.stratergyPattern;

import com.concreteStrategies.DisplayAsGraphicsBehaviour;
import com.concreteStrategies.DisplayAsTextBehaviour;
import com.concreteStrategies.JetFlyBehaviour;
import com.concreteStrategies.NoQuackBehaviour;
import com.concreteStrategies.SimpleFlyBehaviour;
import com.concreteStrategies.SimpleQuackBehaviour;

public class miniDuckSimulator{
    public static void main (String args[]){
        Duck cityDuck = new Duck(new JetFlyBehaviour(), new NoQuackBehaviour(), new DisplayAsTextBehaviour());

        cityDuck.display("City Duck");
        cityDuck.fly();
        cityDuck.quack();

        Duck WildDuck = new Duck(new SimpleFlyBehaviour(), new SimpleQuackBehaviour(), new DisplayAsGraphicsBehaviour());

        WildDuck.display("Wild Duck");
        WildDuck.fly();
        WildDuck.quack();

    }
}