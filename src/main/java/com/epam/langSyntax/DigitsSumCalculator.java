package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum = 0;
        int divider = 1000;
        for (int i = 0; i < 4; i++) {
            sum += number / divider;
            number = number % divider;
            divider = divider / 10;
        }
        System.out.println(sum);
    }
}
