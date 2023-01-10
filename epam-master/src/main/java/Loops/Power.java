package Loops;

public class Power {
    public void printPower(int numberToPrint, int power) {
        int result = 1;
    for ( int i = 1; i <= power; i++){ // i must be 1 bcs it cant be 0 since a number power to 0 will result in 1 and not twice the number itself
       //int result = numberToPrint * numberToPrint;
       result = result * numberToPrint;

    }System.out.println(result);
    }
}
