package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if (x == 0 || y == 0) {
            System.out.println("zero");
        }
        else if (x > 0 && y > 0) {
            System.out.println("first");
        }
        else if (x < 0 && y > 0) {
            System.out.println("second");
        }
        else if (x < 0 && y < 0) {
            System.out.println("third");
        }
        else if (x > 0 && y < 0) {
            System.out.println("fourth");
        }
    }
//    Create a program that will consume 2 integers from method args as data of a coordinate
//    point in a XY coordinate system and determine in which quadrant the coordinate point lies(beginning with top right:"first", "second", "third", "fourth", "zero"):
}

