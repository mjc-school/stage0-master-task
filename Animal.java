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

    public String getDescription() {
        String furDescription = hasFur ? "a" : "no";
        String pawDescription = numberOfPaws == 1 ? "paw" : "paws";
        return String.format("This animal is mostly %s. It has %d %s and %s fur.", color, numberOfPaws, pawDescription, furDescription);
    }

}
