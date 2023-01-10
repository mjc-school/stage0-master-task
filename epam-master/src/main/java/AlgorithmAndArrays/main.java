package AlgorithmAndArrays;

import java.util.Arrays;

public class main {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(new ArraysTasks().seasonsArray()));
        System.out.println(Arrays.toString(new ArraysTasks().generateNumbers(5)));
        int[] arr  = {5,0,-1};
        System.out.println(new ArraysTasks().totalSum(arr));
        System.out.println(new ArraysTasks().findIndexOfNumber(arr,5));
        String[] fruits = {"apple", "pair", "watermelon", "mango", "grapes"};
        System.out.println(Arrays.toString(new ArraysTasks().reverseArray(fruits)));
        System.out.println(Arrays.toString(new ArraysTasks().getOnlyPositiveNumbers(arr)));
        int[][] arr2D = {{3, 1, 2,}, {3,2}};
        System.out.println(Arrays.deepToString((arr2D)));
    }
}
