package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {

        int r1 = number % 10;
        number /= 10;
        int r10 = number % 10;
        number /= 10;
        int r100 = number % 10;
        number /= 10;
        int r1000 = number % 10;

        int sum = r1 + r10 + r100 + r1000;

        System.out.println(sum);
    }
}
