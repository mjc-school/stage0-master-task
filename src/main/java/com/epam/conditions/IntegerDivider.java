package com.epam.conditions;

public class IntegerDivider {
    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("divider cannot be 0");
            return;
        }
        int result = dividend / divider;
        int multipliedResult = result * divider;
        if (multipliedResult == dividend) {
            System.out.println("can be divided completely");
        } else {
            System.out.println("cannot be divided completely");
        }
    }

}
