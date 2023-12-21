package com.epam.loops;

import java.util.Scanner;

public class MultiplicationTable {

    public void printTable(int numberTableToPrint) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Input a number: ");
        int number = scanner.nextInt();

        for (int i = 1; i <= numberTableToPrint; i++) {
            System.out.printf("%d x %d = %d%n", number, i, number * i);
        }
    }
}
