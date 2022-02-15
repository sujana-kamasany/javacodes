/**
 * Java implementation of recursive generic Binary Search.
 *
 *
 * @author Ashwin Nayak
 * @since 2022.02.12
 */

class BinarySearch<T extends Comparable<? super T>> {
    // Returns index of x if it is present in arr[l..r], else return -1
    int binarySearch(T arr[], int l, int r, T x )
    {
        if (r >= l) {
            int mid = l + (r - l) / 2;

            // If the element is present at the middle itself
            if (arr[mid].compareTo(x) == 0)
                return mid;

            // If element is smaller than mid, then it can only be present in left subarray
            if (arr[mid].compareTo(x) > 0)
                return binarySearch(arr, l, mid - 1, x);

            // Else the element can only be present in right subarray
            return binarySearch(arr, mid + 1, r, x);
        }

        // We reach here when element is not present in array
        return -1;
    }

    // Driver method to test above
    public static void main(String args[])
    {
        BinarySearch<Double> ob = new BinarySearch<>();
        // Requirment: Array must be sorted
        Double arr[] = { 2.3, 3.4, 4.5, 10.0, 40.8 };
        int n = arr.length;
        double x = 10.0;
        int result = ob.binarySearch(arr, 0, n - 1, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }
}
