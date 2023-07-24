package com.epam.langSyntax;

import com.epam.OOP.Bird;


public class NumberReverter {
    public int reversedNumber;
    public void revert(int number) {

        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        this.reversedNumber = reversed;
    }

}
