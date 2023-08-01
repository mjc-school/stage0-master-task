package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        String digits = String.valueOf(number);
        System.out.print(digits.charAt(2));
        System.out.print(digits.charAt(1));
        System.out.println(digits.charAt(0));
    }
}
