package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int[] months = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (year < 1 || month < 1 || month > 12) {
            System.out.println("invalid date");
        } else {
            if (isLeapYear(year) && month == 2) {
                System.out.println(29);
            } else {
                System.out.println(months[month - 1]);
            }
        }

    }
    public boolean isLeapYear(int year) {
        return year % 4 == 0 && year % 100 != 0 || year % 400 == 0;
    }

}
