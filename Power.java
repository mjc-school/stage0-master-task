
// Write a program that will find power of any number using for loop
public class Power {
    public void printPower(int numberToPrint, int power) {
        long ans = numberToPrint;
        for (int i = 2; i <= power; i++) {
            ans *= numberToPrint;
        }
        System.out.println(ans);
    }

    public static void main(String[] args) {
        new Power().printPower(2, 10);
    }
}
