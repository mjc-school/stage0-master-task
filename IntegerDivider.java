package Condition;

public class IntegerDivider {
	public void printCompletelyDivided(int dividend, int divider) {
		if (divider == 0) {
            System.out.println("Not Valid");
        } else {
            int result = dividend / divider;
            int product = result * divider;

            if (product == dividend) {
                System.out.println("Can be divided completely");
            } else {
                System.out.println("Cannot be divided completely");
            }
        }
    }

	public static void main(String[] args) {
		IntegerDivider myDivider = new IntegerDivider();
		myDivider.printCompletelyDivided(5, 4);
		myDivider.printCompletelyDivided(15, 3);
		myDivider.printCompletelyDivided(4, 0);
	}
}
