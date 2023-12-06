package loop;

public class Power {

	public void printPower(int numberToPrint, int power) {
		int result = 1;
		for(int i = 0; i < power; i++) {
			result = result * numberToPrint;
		}
		System.out.println(numberToPrint + " to the power of " + power + " is equal to: " + result);
	}
	public static void main(String[] args) {
		new Power().printPower(10, 3);

	}

}
