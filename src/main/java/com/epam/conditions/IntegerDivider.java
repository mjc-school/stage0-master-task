package com.epam.conditions;



public class IntegerDivider {

    public void printCompletelyDivided(int dividend, int divider) {
        if (divider == 0) {
            System.out.println("division by zero");
        }
        else {

        int res = dividend / divider;
        if (res * divider == dividend) {
            System.out.println("can be divided completely");
        }
        else {
            System.out.println("cannot be divided completely");
        }
        }
    }

}
