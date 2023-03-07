public class ArrayTask {

    public static String[] season() {
        String[] ses = new String[] {"winter", "spring", "summer", "autumn"};
        return ses;
    }

    public static int[] generateNumbers(int len) {
        //len += 1;
        int[] res = new int[len];
        for (int i = 0; i < len; i++) {
            res[i] = i+1;
        }
        return res;
    }

    public static int totalSum(int[] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            sum += arr[i];
        }
        return sum;
    }

    public static int findIndexOfNumber(int[] arr, int number) {
        int ind = -1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == number) {
                ind = i;
                break;
            }
        }
        return ind;
    }

    public static String[] reverseArray (String[] arr) {
        int len = arr.length;
        String[] res = new String[len];
        for (int i = 0; i < len; i++) {
            res[i] = arr[len - i - 1];
        }
        return res;
    }

    public static int[] getOnlyPositiveNumbers(int[] arr) {
        int len = arr.length;
        int num = 0;

        for(int i = 0; i < len; i++) {
            if(arr[i] > 0) {
                num += 1;
            }
        }

        int[] res = new int[num];
        int k = 0, j = 0;
        while(k < num) {
            if(arr[j] > 0) {
                res[k] = arr[j];
                ++k;
            }
            j++;
        }

        return res;
    }
    public static void main(String[] args) {
        //season();
        String[] s = new String[] {"a", "b", "c", "d"};
        int[] res = generateNumbers(6);
        String[] ans = season();
        System.out.println(totalSum(res));
        System.out.println(findIndexOfNumber(res, 1));
        String[] sAns = reverseArray(s);
        int[] array = new int[] {1, -1, 2, -2, -4};
        int[] pos = getOnlyPositiveNumbers(array);
//        for (int i = 0; i < ans.length; i++) {
//            System.out.println(ans[i]);
//        }
//        for (int i = 0; i < res.length; i++) {
//            System.out.print(res[i]);
//        }
        for (int i = 0; i < sAns.length; i++) {
            System.out.print(sAns[i]);
        }
        for (int i = 0; i < pos.length; i++) {
            System.out.print(pos[i]);
        }
    }
}
