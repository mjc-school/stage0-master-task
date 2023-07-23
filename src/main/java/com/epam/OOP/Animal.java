package com.epam.OOP;

class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    Animal(String color,int numberOfPaws,boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    String getDescription() {
        String article = this.hasFur ? "a" : "no";
        String pawAmount = this.numberOfPaws <= 1 ? "paw" : "paws";
        return String.format(
                "This animal is mostly %s." +
                " It has %d %s and %s fur.",this.color,this.numberOfPaws,pawAmount,article);
    }
}
