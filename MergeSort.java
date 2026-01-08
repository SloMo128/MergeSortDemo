public class MergeSort {

    /**
     * Sorts an array using the Merge Sort algorithm.
     *
     * @param a the array to be sorted
     */
    public static void sort(int[] a) {

        // Merge Sort works only if the array has more than one element
        if (a.length > 1) {

            // Create the first half of the array
            int[] first = new int[a.length / 2];

            // Create the second half of the array
            int[] second = new int[a.length - first.length];

            // Copy elements into the first half
            for (int i = 0; i < first.length; i++) {
                first[i] = a[i];
            }

            // Copy elements into the second half
            for (int i = 0; i < second.length; i++) {
                second[i] = a[first.length + i];
            }

            // Recursively sort both halves
            sort(first);
            sort(second);

            // Merge the two sorted halves into the original array
            merge(first, second, a);
        }
    }

    /**
     * Merges two sorted arrays into a single sorted array.
     *
     * @param first  the first sorted array
     * @param second the second sorted array
     * @param a the array where the merged result is stored
     */
    private static void merge(int[] first, int[] second, int[] a) {

        // Index for the first array
        int iFirst = 0;

        // Index for the second array
        int iSecond = 0;

        // Index for the merged array
        int j = 0;

        // Compare elements from both arrays and copy the smaller one
        while (iFirst < first.length && iSecond < second.length) {
            if (first[iFirst] < second[iSecond]) {
                a[j] = first[iFirst];
                iFirst++;
            } else {
                a[j] = second[iSecond];
                iSecond++;
            }
            j++;
        }

        // Copy remaining elements from the first array (if any)
        while (iFirst < first.length) {
            a[j] = first[iFirst];
            iFirst++;
            j++;
        }

        // Copy remaining elements from the second array (if any)
        while (iSecond < second.length) {
            a[j] = second[iSecond];
            iSecond++;
            j++;
        }
    }
}
