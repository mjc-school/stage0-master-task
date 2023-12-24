package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        int counter = 1;
        while (counter <= cathetusLength) {
            for (int i = cathetusLength; i > 0; i--) {
                if (i > counter) {
                    System.out.print(" ");
                } else {
                    System.out.print(i);
                }
            }
            for (int i = 2; i <= counter; i++) {
                System.out.print(i);
            }
            System.out.println();
            counter++;
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
