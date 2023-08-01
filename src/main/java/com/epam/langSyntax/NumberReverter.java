package com.epam.langSyntax;

import com.epam.OOP.Bird;


public class NumberReverter {
    public void revert(int number) {

        int reversedNumber;
        int reversed = 0;

        while (number != 0) {
            int digit = number % 10;
            reversed = reversed * 10 + digit;
            number /= 10;
        }
        reversedNumber = reversed;

        System.out.println(reversed);

    }
    public static void main(String[] args) {
        new NumberReverter().revert(433);
    }

}
