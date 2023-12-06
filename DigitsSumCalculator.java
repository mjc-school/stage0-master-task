package Lang_Syntax;

public class DigitsSumCalculator {
	public int calculateSum(int number) {
		int sum = 0;
		while(number > 0) {
			int digit = number % 10;
			sum = sum + digit;
			number = number / 10;
		}
		return sum;
	}
	public static void main(String []args) {
		DigitsSumCalculator mySum = new DigitsSumCalculator();
		int number = 3463;
		int sum = mySum.calculateSum(number);
		System.out.println("Sum of " + number + " is : " + sum);
	}
}
