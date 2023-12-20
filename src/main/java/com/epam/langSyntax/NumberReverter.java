package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int revertNumber = 0;
        while (number != 0) {
            revertNumber *= 10;
            revertNumber += number % 10;
            number /= 10;
        }
        System.out.println(revertNumber);
    }

}
