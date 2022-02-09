package JavaTut;

import java.util.Arrays;

public class QuickSort {
    //selects last element as pivot
    int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = (low - 1); //Smaller element index
        for (int j = low; j < high; j++) {
            //Check current element is less than or equal to pivot
            if (arr[j] <= pivot) {
                i++;
                //Swap arr[i] & arr[j]
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }
        //Swap arr[i + 1] & arr[high] (or pivot)
        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    //Recursively sort array partitions
    void quick_sort(int[] arr, int low, int high) {
        if (low < high) {
            //Partition the array around pivot=>partitioning index and return pivot
            int pivot = partition(arr, low, high);
            //Sort each partition recursively
            quick_sort(arr, low, pivot - 1);
            quick_sort(arr, pivot + 1, high);
        }
    }
}

class Main {
    public static void main(String[] args) {
        int[] unsortedArray = {1, 7, 3, -56, 78, 0, 7, 3, 34, -42};
        int n = unsortedArray.length;
        //Print unsorted array
        System.out.println("Unsorted Array: " + Arrays.toString(unsortedArray));
        //Use QuickSort
        QuickSort obj = new QuickSort();
        obj.quick_sort(unsortedArray, 0, n - 1);
        //Print sorted array
        System.out.println("Sorted Array: " + Arrays.toString(unsortedArray));
    }
}