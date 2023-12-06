package Lang_Syntax;

public class NumberReverter {
	public int revert(int number){
		int rev = 0;
		
		while(number != 0) {
			int rem = number % 10;
			rev = rev * 10 + rem;
			number /= 10;
			}
		return rev;
	}
	
	public static void main(String[] args) {
		NumberReverter myNum = new NumberReverter();
		int number = 458;
		int rev = myNum.revert(number);
		System.out.println("Revert of " + number + " is: " + rev);
	}

}
