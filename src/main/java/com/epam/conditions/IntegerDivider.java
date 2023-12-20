package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        try {
            if (dividend / divider * divider == dividend) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }
        } catch (ArithmeticException e) {
            System.out.println("division by zero");
        }
    }

}
