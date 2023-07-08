package com.epam.conditions;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        int result = dividend / divider;
        int multipliedResult = result * divider;
        if (multipliedResult == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }

}
