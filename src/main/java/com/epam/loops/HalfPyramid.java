package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {

        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = cathetusLength; j >= 1; j--) {
                if (i >= j) System.out.print("*");
                else System.out.print(" ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
