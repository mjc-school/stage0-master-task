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
        StringBuilder description = new StringBuilder("This animal is mostly ");
        description.append(this.color);
        description.append(". It has ");
        if (this.numberOfPaws == 1) {
            description.append("1 paw");
        } else {
            description.append(this.numberOfPaws);
            description.append(" paws");
        }
        if (this.hasFur) {
            description.append(" and a fur.");
        } else {
            description.append(" and no fur.");
        }
        return description.toString();
    }

    public static void main(String[] args) {
        Animal cat = new Animal("black", 4, false);
        System.out.println(cat.getDescription());
        Bird bird = new Bird();
        System.out.println(bird.getDescription());
        Dog dog = new Dog();
        System.out.println(dog.getDescription());
    }
}
