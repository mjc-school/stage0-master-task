package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {

        int n = 1;
        for (int i = 1; i <= cathetusLength; i++) {
            for (int j = cathetusLength - 1; j >= i; j--) {
                System.out.print(" ");
            }
            for (int k = n; k >= 1; k--) {
                System.out.print(Math.abs(k - i) + 1);
            }
            n += 2;
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
