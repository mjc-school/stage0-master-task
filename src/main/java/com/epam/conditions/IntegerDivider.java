package com.epam.conditions;

public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider != 0) {
            if (dividend == dividend / divider * divider) {
                System.out.println("can be divided completely");
            } else {
                System.out.println("cannot be divided completely");
            }
        } else {
            System.out.println("division by zero");
        }
    }

}
