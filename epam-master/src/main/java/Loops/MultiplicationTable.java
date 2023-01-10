package Loops;
//Write a program that prompts the user to input a positive integer.
// It should then print the multiplication table of that number.
public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        int counter = 1;
     int tableRow = 10;
        while (counter <= tableRow){
            int result = numberTableToPrint * counter;
            System.out.println(numberTableToPrint + " * " + counter + " = " + result);
            counter++;
        }

    }
}
