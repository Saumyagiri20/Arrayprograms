public class CountGreaterThanX {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {4, 5, 3, 1, 2};
        int X = 3;

        // Count the number of elements strictly greater than X
        int count = countElementsGreaterThanX(arr, X);

        // Print the result
        System.out.println("Number of elements strictly greater than " + X + ": " + count);
    }

    public static int countElementsGreaterThanX(int[] arr, int X) {
        int count = 0;
        for (int num : arr) {
            if (num > X) {
                count++;
            }
        }
        return count;
    }
}
