package com.epam.algorithms;

/**
 * Here are the tasks for working with the arrays.
 * <p>
 * The usage of any additional packages (such as java.util.*) is forbidden.
 */
public class ArrayTasks {

    /**
     * Return a String[] array that will list all the seasons of the year, starting with winter.
     */
    public String[] seasonsArray() {
        return new String[]{"winter", "spring", "summer", "autumn"};
    }

    /**
     * Generate an int[] array of consecutive positive integers starting at 1 of the given length (length parameter >
     * 0).
     * <p>
     * Example:
     * <p>
     * length = 1  -> [1] length = 3  -> [1, 2, 3] length = 5  -> [1, 2, 3, 4, 5]
     */
    public int[] generateNumbers(int length) {
        int[] array = new int[length];
        for(int i = 0; i < length; i++) array[i] = i+1;
        return array;
    }

    /**
     * Find the sum of all elements of the int[] array.
     * <p>
     * Example:
     * <p>
     * arr = [1, 3, 5]   -> sum = 9 arr = [5, -3, -4] -> sum = -2
     */
    public int totalSum(int[] arr) {
        int sum = 0;
        for (int j : arr) sum += j;
        return sum;
    }

    /**
     * Return the index of the first occurrence of number in the arr array. If there is no such element in the array,
     * return -1.
     * <p>
     * Example:
     * <p>
     * arr = [99, -7, 102], number = -7    ->   2 arr = [5, -3, -4],   number = 10    ->  -1
     */
    public int findIndexOfNumber(int[] arr, int number) {
        int index = -1;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] == number) {
                index = i;
                break;
            }
        }
        return index;
    }

    /**
     * Return the new String[] array obtained from the arr array by reversing the order of the elements.
     * <p>
     * Example:
     * <p>
     * arr = ["Bob", "Nick"]               -> ["Nick", "Bob"] arr = ["pineapple", "apple", "pen"] -> ["pen", "apple",
     * "pineapple"]
     */
    public String[] reverseArray(String[] arr) {

        String[] reversedArr = new String[arr.length];
        for(int i = 0; i < arr.length; i++){

            reversedArr[i] = arr[arr.length-1-i];

        }
        return reversedArr;
    }

    /**
     * Return new int[] array obtained from arr int[] array by choosing positive numbers only. P.S. 0 is not a positive
     * number =)
     * <p>
     * Example:
     * <p>
     * arr = [1,-2, 3]      -> [1, 3] arr = [-1, -2, -3]   -> [] arr = [1, 2]         -> [1, 2]
     */
    public int[] getOnlyPositiveNumbers(int[] arr) {
        int new_size = 0;
        for(int i = 0; i < arr.length; i++) if(arr[i] > 0) new_size++;
        int[] positiveArr = new int[new_size];

        int index = 0;
        for(int i = 0; i < arr.length; i++){

            if(arr[i] > 0){
                positiveArr[index] = arr[i];
                index++;
            }

        }

        return positiveArr;
    }

    /**
     * Return a sorted, ragged, two-dimensional int[][] array following these rules: Incoming one-dimensional arrays
     * must be arranged in ascending order of their length; numbers in all one-dimensional arrays must be in ascending
     * order.
     * <p>
     * Example:
     * <p>
     * arr = [[3, 1, 2,], [3,2]] -> [[2, 3], [1, 2, 3]] arr = [[5, 4], [7]]       -> [[7], [4, 5]]
     */
    public static int[][] sortRaggedArray(int[][] arr) {
        int[][] sorted_arr = arr.clone();
        for(int i = 0; i < sorted_arr.length; i++){

            for(int k = i + 1; k < sorted_arr.length; k++){

                if(sorted_arr[i].length > sorted_arr[k].length){

                    int[] temp = sorted_arr[i];
                    sorted_arr[i] = sorted_arr[k];
                    sorted_arr[k] = temp;

                }

            }

        }
        for(int i = 0; i < sorted_arr.length; i++){

            for(int k = 0; k < sorted_arr[i].length; k++){

                for(int j = k+1; j < sorted_arr[i].length; j++){

                    if(sorted_arr[i][k] > sorted_arr[i][j]){

                        int temp = sorted_arr[i][k];
                        sorted_arr[i][k] = sorted_arr[i][j];
                        sorted_arr[i][j] = temp;

                    }

                }

            }

        }
        return sorted_arr;
    }

}
