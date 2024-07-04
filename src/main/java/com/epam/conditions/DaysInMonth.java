package com.epam.conditions;

public class DaysInMonth {

    private static final int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};

    public static void printDays(int year, int month) {

        if(month >= 1 && month <= 12 && year >= 0) {

            if(year % 4 == 0 && month-1 == 1) System.out.println(29);
            else System.out.println(months[month-1]);
        }
        else System.out.println("invalid date");

    }

}
