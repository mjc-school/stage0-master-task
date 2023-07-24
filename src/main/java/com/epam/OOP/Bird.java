package com.epam.OOP;


public class Bird extends Animal {
    public static void main(String[] args) {
        Bird b = new Bird();
        System.out.println(b.getDescription());
    }
    public Bird() {
        super("blue",2,false);
    }

    @Override
    String getDescription() {
        return super.getDescription() + " Moreover,it has 2 wings and can fly.";
    }
}
