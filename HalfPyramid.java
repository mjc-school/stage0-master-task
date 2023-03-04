//Write a program that will print
//    *
//   **
//  ***

import java.util.Arrays;

public class HalfPyramid {
    public void printHalfPyramid(int cathetusLength) {
        int len = cathetusLength * 2 - 1;
        char[] ans = new char[len];
        Arrays.fill(ans, ' ');

        for (int i = 1; i <= cathetusLength; i++) {
            ans[cathetusLength - i] = '*';
            for (int j = 0; j < len; j++) {
                System.out.print(ans[j]);

            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(5);
    }
}
