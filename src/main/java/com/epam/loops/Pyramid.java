package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int gap = cathetusLength - 1;

        for (int i = 1; i <= cathetusLength; i++) {
            for (int k = 1; k <= gap; k++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j + " ");
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
            gap--;
        }
    }
    public static void main(String[] args) {
        new Pyramid().printPyramid(5);
    }

}
