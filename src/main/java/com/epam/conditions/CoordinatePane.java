package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if (x > 0 && y > 0) {
            System.out.println("first");
        }
        if (x > 0 && y < 0) {
            System.out.println("second");
        }
        if (x < 0 && y < 0) {
            System.out.println("third");
        }
        if (x < 0 && y > 0) {
            System.out.println("fourth");
        }
        else {
            System.out.println("zero");
        }
    }

}

