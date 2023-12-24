package com.epam.conditions;

import java.time.YearMonth;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (month > 12 || month < 1 || year < 0) {
            System.out.println("invalid date");
        } else {
            System.out.println(YearMonth.of(year, month).lengthOfMonth());
        }
    }

}
