import java.util.Arrays;

public class ArraySorter {
    public static void main(String[] args) {
        // Example array
        int[] numbers = {5, 2, 8, 3, 1};

        // Print the original array
        System.out.println("Original array: " + Arrays.toString(numbers));

        // Sort the array
        Arrays.sort(numbers);

        // Print the sorted array
        System.out.println("Sorted array: " + Arrays.toString(numbers));
    }
}
