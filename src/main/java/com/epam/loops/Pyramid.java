package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for (int i = 0; i < cathetusLength; i++) {
            for (int j = -(cathetusLength - 1); j <= i; j++) {
                if (j < -i) {
                    System.out.print(" ");
                } else {
                    System.out.print(Math.abs(j) + 1);
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
