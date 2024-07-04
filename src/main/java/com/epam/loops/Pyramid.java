package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        for(int i = 1; i <= cathetusLength; i++){
            for(int k = 0; k < cathetusLength - i; k++) System.out.print(" ");
            for(int k = -i; k <= i; k++){
                System.out.print((k == -1 || k == 0) ? "" : ((k < 0) ? k*-1 : k));
            }
            System.out.print('\n');
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
