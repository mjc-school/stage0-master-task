import java.util.Arrays;

public class Pyramid {
    public void printPyramid(int cathetusLength) {
        int len = cathetusLength*2 - 1;
        int[] ans = new int[len];

        for (int i = 1; i <= cathetusLength; i++) {
            Arrays.fill(ans, 0);
            for (int j = 0; j < i; j++) {
                ans[cathetusLength - 1 - j] = j+1;
                ans[cathetusLength - 1 + j] = j+1;
            }
            for (int j = 0; j < len; j++) {
                if (ans[j] == 0) {
                    System.out.print(' ');
                } else {
                    System.out.print(ans[j]);
                }
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        new Pyramid().printPyramid(3);
    }
}