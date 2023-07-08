package com.epam.loops;

public class Pyramid {

    // number pyramid centered by 1
    public void printPyramid(int cathetusLength) {
        String pyramid = "";
        String temp = "";
        for (int i = 1; i <= cathetusLength; i++) {
            temp = "";
            for (int j = 1; j <= cathetusLength - i; j++) {
                temp += " ";
            }
            for (int j = i; j >= 1; j--) {
                temp += j;
            }
            for (int j = 2; j <= i; j++) {
                temp += j;
            }
            pyramid += temp + "\n";
        }
        System.out.println(pyramid);
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
