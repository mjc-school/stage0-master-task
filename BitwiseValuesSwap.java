public class BitwiseValuesSwap {
    public void swap(int first, int second) {
        first += second;
        second = first - second;
        first -= second;
        System.out.printf("first: %d\nsecond: %d ", first, second);
    }

    /*
    public static void main(String[] args) {
        swap(2, 5);
    }
     */
}
