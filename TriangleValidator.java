package Condition;

public class TriangleValidator {
	public void validate(double firstSide, double secondSide, double thirdSide) {
		if (firstSide + secondSide > thirdSide && firstSide + thirdSide > secondSide && secondSide + thirdSide > firstSide) {
			System.out.println("This is a valid triangle");
		}
		else{
				System.out.println("It's not a triangle.");
			}
		}
	public static void main(String []args) {
		TriangleValidator myTriangle = new TriangleValidator();
		myTriangle.validate(5.0, 4.0, 3.0);
		myTriangle.validate(5.0, 6.0, 12.0);
	}
}