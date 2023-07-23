package com.epam.OOP;

public class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color, int numberOfPaws, boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }

    public String getDescription(){
        String pawWord = numberOfPaws == 1 ? "paw" : "paws";
        return String.format(
                "This animal is mostly %s. " +
                        "It has %d " + pawWord +
                        " and %s fur.",
                color,
                numberOfPaws,
                hasFur? "a":"no");
    }
}
