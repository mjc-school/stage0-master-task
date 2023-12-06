package Condition;

public class BitwiseValuesSwap {
	public void swap(int first, int second) {
		System.out.println(first + " : " + second);
		
		first = first ^ second;
		second = first ^ second; 
		first = first ^ second;
		
		System.out.println(first + " : " + second);
    }
	public static void main(String[] args) {
		BitwiseValuesSwap mySwap = new BitwiseValuesSwap();
		
		mySwap.swap(2, 3);
	}
}
