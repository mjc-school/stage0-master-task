package com.epam;

import com.epam.OOP.Animal;
import com.epam.OOP.Bird;
import com.epam.OOP.Dog;
import com.epam.algorithms.ArrayTasks;
import com.epam.conditions.*;
import com.epam.langSyntax.DigitsSumCalculator;
import com.epam.langSyntax.NumberReverter;
import com.epam.loops.MultiplicationTable;

public class Application {

    public static void main(String[] args){
        //OOP
        Animal animal = new Animal("green", 2, false); // This animal is mostly green. It has 2 paws and no fur.
        Dog dog = new Dog(); // This animal is mostly brown. It has 4 paws and a fur.
        Bird bird = new Bird(); // This animal is mostly blue. It has 2 paws and no fur. Moreover, it has 2 wings and can fly.
        System.out.println(animal.getDescription());
        System.out.println(dog.getDescription());
        System.out.println(bird.getDescription());
        //Lang Syntax
        NumberReverter.revert(8374);
        DigitsSumCalculator.calculateSum(2131);
        //Conditions
        SeasonDeterminer.tellTheSeason(15);
        TriangleSidesValidator.validate(1,3,3);
        DaysInMonth.printDays(2011, 2);
        IntegerDivider.printCompletelyDivided(20, 3);
        CoordinatePane.printQuadrant(3, -1);
        BitwiseValuesSwap.swap(1,6);
        //Loops
        MultiplicationTable.printTable(6);
    }


}
/*
* class animal is a parent class, with parameters we put data into arguments and got information by method getDescription().
* class Dog is child class from Animal, it extends method getDescription() and it's properties like color, numberOfPaws and hasFur
* key word super calls constructor of Parent class animal and put arguments into class Dog.
* with our class Bird is the same situation, but there we have override method getDescription(), it has't parameters like it's parent class.
*/