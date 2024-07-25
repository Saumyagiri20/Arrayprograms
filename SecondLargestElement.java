public class SecondLargestElement {
    public static void main(String[] args) {
        int[] arr = {12, 35, 2, 10, 34, 1};

        // Find the second largest element
        int secondLargest = findSecondLargest(arr);

        // Print the result
        System.out.println("Second largest element is: " + secondLargest);
    }

    public static int findSecondLargest(int[] arr) {
        if (arr.length < 2) {
            throw new IllegalArgumentException("Array must have at least two elements");
        }

        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > largest) {
                secondLargest = largest;
                largest = num;
            } else if (num > secondLargest && num < largest) {
                secondLargest = num;
            }
        }

        if (secondLargest == Integer.MIN_VALUE) {
            throw new IllegalArgumentException("No second largest element found");
        }

        return secondLargest;
    }
}
