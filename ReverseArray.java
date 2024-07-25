import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {
        int N = 5;
        int[] arr = {1, 1, 2, 2, 3};

        System.out.println("Original Array: " + Arrays.toString(arr));

        // Reverse the array
        reverseArray(arr);

        System.out.println("Reversed Array: " + Arrays.toString(arr));
    }

    public static void reverseArray(int[] arr) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            // Swap the elements at start and end
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;

            // Move the pointers
            start++;
            end--;
        }
    }
}
