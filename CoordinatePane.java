package Condition;

public class CoordinatePane {
	public void printQuadrant(int x, int y) {
		if(x > 0 && y > 0) {
			System.out.println("Fisrt");
		}
		else if(x< 0 && y > 0 ) {
			System.out.println("Second");
		}
		else if(x< 0 && y < 0) {
			System.out.println("Third");
		}
		else if(x> 0 && y < 0) {
			System.out.println("Fourth");
		}
		else if(x==0 && y==0) {
			System.out.println("Zero");
		}
		else {
			System.out.println("On axis, but not quadrant");
		}
    }
	
	public static void main(String []args) {
		CoordinatePane myQuadrant = new CoordinatePane();
		
		myQuadrant.printQuadrant(5, 4);
		myQuadrant.printQuadrant(5, -4);
		myQuadrant.printQuadrant(-5, 4);
		myQuadrant.printQuadrant(0, 0);
		myQuadrant.printQuadrant(0, 4);
	}
}
