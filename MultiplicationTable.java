package loop;

import java.util.Scanner;

public class MultiplicationTable {

	public void printTable(int numberTableToPrint) {
		 if (numberTableToPrint <= 0) {
	            System.out.println("Not Valid");
	        } else {
	            System.out.println("Multiplication table for " + numberTableToPrint + ":");

	            for (int i = 1; i <= 10; i++) {
	                System.out.println(numberTableToPrint + " x " + i + " = " + (numberTableToPrint * i));
	            }
	        }
	    }
	public static void main(String[] args) {
		MultiplicationTable myTable = new MultiplicationTable();
		Scanner input = new Scanner(System.in);
		
		System.out.print("Enter a positive integer: ");
		int number = input.nextInt();
		
		myTable.printTable(number);
	}

}
