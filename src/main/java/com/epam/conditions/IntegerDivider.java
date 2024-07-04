package com.epam.conditions;

public class IntegerDivider {

    public static void printCompletelyDivided(int dividend, int divider) {

        if(divider != 0)
            if((dividend / divider) * divider == dividend) System.out.println("can be divided completely");
            else System.out.println("cannot be divided completely");
        else System.out.println("division by zero");

    }

}
