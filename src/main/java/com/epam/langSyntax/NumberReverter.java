package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {

        int r1 = number % 10;
        int r10 = number / 10 % 10;
        int r100 = number / 100;

        int result = r1 * 100 + r10 * 10 + r100;

        System.out.println(result);
    }
}
