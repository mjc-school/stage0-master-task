package com.epam.langSyntax;

public class DigitsSumCalculator {

    public static void calculateSum(int number) {

        int summa = 0;

        while(number != 0){

            summa = summa + number%10;
            number = number/10;

        }
        System.out.println(summa);
    }

}
