package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        if (cathetusLength > 0) {
            StringBuilder floor = new StringBuilder();
            while (floor.length() < cathetusLength) {
                floor.append(" ");
            }
            for (int i = 1; i <= cathetusLength; i++) {
                floor.append("*").delete(0,1);
                System.out.println(floor);
            }
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
