package com.epam.OOP;


public class Bird extends Animal {
    Bird() {
        super("blue",2,false);
    }

    @Override
    String getDescription() {
        return super.getDescription() + " it has 2 wings and can fly";
    }
}
