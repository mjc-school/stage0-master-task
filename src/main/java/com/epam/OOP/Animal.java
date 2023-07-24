package com.epam.OOP;

class Animal {
    private String color;
    private int numberOfPaws;
    private boolean hasFur;

    public Animal(String color,int numberOfPaws,boolean hasFur) {
        this.color = color;
        this.numberOfPaws = numberOfPaws;
        this.hasFur = hasFur;
    }
    public static void main(String[] args) {
        System.out.println(new Animal("yellow",2,false).getDescription());
    }
    String getDescription() {
        String article = this.hasFur ? "a" : "no";
//        String pawAmount = this.numberOfPaws == 1 ? "paw" : "paws";
        return String.format(
                "This animal is mostly %s. It has %d paws and %s fur.",this.color,this.numberOfPaws,article);
    }
}
