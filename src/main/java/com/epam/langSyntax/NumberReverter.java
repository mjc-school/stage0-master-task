package com.epam.langSyntax;

import java.util.Stack;

public class NumberReverter {

    public static void revert(int number) {

        int revertedNumber = 0;
        while(number != 0){
            revertedNumber = revertedNumber * 10 + number % 10;
            number = number / 10;

        }
        System.out.println(revertedNumber);
    }

}
