package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        boolean isLeapYear = (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) && year > 0;
        if (month == 2) {
            if (isLeapYear) {
                System.out.println("29 days");
            } else {
                System.out.println("28 days");
            }
        } else if (month == 4 || month == 6 || month == 9 || month == 11) {
            System.out.println("30 days");
        } else if (month == 1 || month == 3 || month == 5 || month == 7
                || month == 8 || month == 10 || month == 12) {
            System.out.println("31 days");
        } else {
            System.out.println("invalid date");
        }
    }

}
