import java.util.Scanner;

public class MultiplicationTable {
    public void printTable(int numberTableToPrint) {
        for (int i = 1; i < 10; i++){
            System.out.printf("%d * %d = %d\n", numberTableToPrint, i, numberTableToPrint*i);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter positive number: ");
        int n = scan.nextInt();
        new MultiplicationTable().printTable(n);
    }
}
