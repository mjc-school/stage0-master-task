package AlgorithmAndArrays;

public class ArraysTasks {
    public String[] seasonsArray() {
    String[] strings = new String[4];
    strings[0]=("Winter");
    strings[1]=("Spring");
    strings[2]=("Summer");
    strings[3]=("Autumn");
    return  strings;
    }

    public int[] generateNumbers(int length) {
        int[] array = new int[length];
        for(int i = 0; i < length; i++){
            array[i] = 1;
            array[i] = 1+i;
        }
        return array;
    }

    public int totalSum(int[] arr) {
       int sum = 0;
       for(int i=0; i < arr.length; i++){
         sum = sum +  arr[i];
       }
        return sum;
    }

    public int findIndexOfNumber(int[] arr, int number) {

        for(int i = 0; i < arr.length; i++)
            if(arr[i] == number)
        return i;

            return -1;
    }

    public String[] reverseArray(String[] arr) {
        String[] reverse = new String[arr.length];
        for(int i=0; i<reverse.length; i++) {
            reverse[i] = arr[reverse.length-1-i]; //-1 bcs of how java counts array indexes
            //System.out.print(reverse[i]);
        }
        return reverse;
    }

    public int[] getOnlyPositiveNumbers(int[] arr) {
        int[] positivesOnly = new int[arr.length];
        for(int i = 0; i < arr.length; i++){
            if ( arr[i] > 0)
                positivesOnly[i] = arr[i];
        }
        return positivesOnly;
    }


    public int[][] sortRaggedArray(int[][] arr) {
        // COULD NOT DO IT WITHOUT java.util... :(
        return null;
        }


    }

