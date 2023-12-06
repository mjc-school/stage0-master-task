package loop;

public class HalfPyramid {

	public void printHalfPyramid(int cathetusLength) {
		for(int i = cathetusLength; i >= 1; i-- )
		{
			for(int k = 1; k < i; k++)
			{
				System.out.print(" ");
			}
			for (int k = 0; k <= cathetusLength - i; k++) {
                System.out.print("*");
            }
			System.out.println();
		}
	}
	public static void main(String[] args) {
		new HalfPyramid().printHalfPyramid(8);
	}

}
