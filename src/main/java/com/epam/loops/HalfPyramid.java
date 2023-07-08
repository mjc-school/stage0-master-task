package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        String pyramid = "";
        String temp = "";
        for (int i = 0; i < cathetusLength; i++) {
            temp = "";
            for (int j = 1; j <= cathetusLength - i; j++) {
                temp += " ";
            }
            for (int k = 0; k <= i; k++) {
                temp += "*";
            }
            pyramid += temp + "\n";
        }
        System.out.print(pyramid);
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
