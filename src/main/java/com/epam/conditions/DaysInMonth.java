package com.epam.conditions;

public class DaysInMonth {

    public void printDays(int year, int month) {
        if (year < 1 || month < 1 || month > 12) {
            System.out.println("invalid date");
        } else {
            boolean yearIsLeap = year % 4 == 0 && year  % 100 != 0 || year % 400 == 0;
            if (yearIsLeap && month == 2) {
                System.out.println(29);
            } else {
                switch (month) {
                    case 1, 3, 5, 7, 8, 11, 12 -> System.out.println(31);
                    case 2 -> System.out.println(28);
                    default -> System.out.println(30);
                }
            }
        }
    }

}
