package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        if(number < 100 || number > 999) {
            System.out.println("Input number must be a 3-digit number.");
        } else {
            int reversedNumber = 0;
            int remainder;

            while(number != 0) {
                remainder = number % 10;
                reversedNumber = reversedNumber * 10 + remainder;
            }
        }
    }

}
