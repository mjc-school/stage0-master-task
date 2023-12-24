package com.epam.conditions;

public class CoordinatePane {

    public void printQuadrant(int x, int y) {
        if (x == 0 || y == 0) {
            System.out.println("zero");
        } else if (x > 0) {
            if (y > 0) {
                System.out.println("first");
            } else {
                System.out.println("fourth");
            }
        } else {
            if (y > 0) {
                System.out.println("second");
            } else {
                System.out.println("third");
            }
        }
    }

}

