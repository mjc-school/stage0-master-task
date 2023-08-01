package com.epam.conditions;

public class SeasonDeterminer {

    public void tellTheSeason(int monthNumber) {
        switch (monthNumber) {
            case 1 -> System.out.println("Winter");
            case 2 -> System.out.println("Winter");
            case 3 -> System.out.println("Spring");
            case 4 -> System.out.println("Spring");
            case 5 -> System.out.println("Spring");
            case 6 -> System.out.println("Summer");
            case 7 -> System.out.println("Summer");
            case 8 -> System.out.println("Summer");
            case 9 -> System.out.println("Autumn");
            case 10 -> System.out.println("Autumn");
            case 11 -> System.out.println("Autumn");
            case 12 -> System.out.println("Winter");
            default -> System.out.println("Wrong month number");
        }
    }

}
