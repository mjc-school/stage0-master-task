package com.epam.OOP;


public class Animal {

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public String getDescription() {
        String forPaws = "paw";
        String forFur = "no";
        String result;
        if (numberOfPaws > 1) {
            forPaws = "paws";
        }
        if (hasFur) {
            forFur = "a";
        }
        result = String.format("This animal is mostly %s. It has %d %s and %s fur.", color, numberOfPaws, forPaws, forFur );
        return result;
    }
}

