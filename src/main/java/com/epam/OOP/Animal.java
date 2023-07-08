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
        String res = "This animal is mostly " + color + ".";
        if (this.numberOfPaws == 1){
            res += "It has " + numberOfPaws + " paw ";
        } else {
            res += "It has " + numberOfPaws + " paws ";
        }
        if (this.hasFur){
            res += "and a fur.";
        } else {
            res += "and no fur.";
        }
        return res;
    }
}
