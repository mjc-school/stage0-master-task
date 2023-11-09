package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        int[] array = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31};
        if (month > 0 && month < 13) {
            if (year % 400 == 0 || year % 4 == 0 && year % 100 != 0) {
                array[1] = 29;
            }
            System.out.println(array[month - 1]);
        }
        else {
            System.out.println("invalid date");
        }
    }

}
