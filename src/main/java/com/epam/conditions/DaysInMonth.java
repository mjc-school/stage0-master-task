package com.epam.conditions;

import java.time.YearMonth;

public class DaysInMonth {

    public void printDays(int year, int month) {
        System.out.println(YearMonth.of(year, month).lengthOfMonth());
    }

}
