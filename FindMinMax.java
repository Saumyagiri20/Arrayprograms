public class FindMinMax {
    public static void main(String[] args) {
        int N = 4;
        int[] arr = {5, 4, 2, 1};

        // Find the maximum and minimum elements in the array
        int maxElement = findMax(arr);
        int minElement = findMin(arr);

        // Print the results
        System.out.println("Maximum Element: " + maxElement);
        System.out.println("Minimum Element: " + minElement);
    }

    // Method to find the maximum element in an array
    public static int findMax(int[] arr) {
        int max = arr[0];
        for (int num : arr) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    // Method to find the minimum element in an array
    public static int findMin(int[] arr) {
        int min = arr[0];
        for (int num : arr) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
