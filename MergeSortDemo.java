import java.util.Arrays;
import java.util.Random;

public class MergeSortDemo {

    public static void main(String[] args) {

        // Generate an array of 20 random integers between 0 (inclusive) and 100 (exclusive)
        int[] a = new Random().ints(20, 0, 100).toArray();

        // Print the array before sorting
        System.out.print("Array before sorting:");
        System.out.println(Arrays.toString(a));

        // Sort the array using the Merge Sort algorithm
        MergeSort.sort(a);

        // Print the array after sorting
        System.out.print("Array after sorting:");
        System.out.println(Arrays.toString(a));
    }
}
