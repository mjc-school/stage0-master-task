package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        System.out.println(number % 10 * 100 + number % 100 - number % 10 + number / 100);
    }

}
