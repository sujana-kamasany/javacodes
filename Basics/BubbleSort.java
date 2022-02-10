package JavaTut;

import java.util.Arrays;

public class BubbleSort {
    //Bubble Sort Algorithm (optimised) Time Complexity: 0(n*n)
    void bubble_Sort(int[] arr) {
        int n = arr.length;
        boolean swapped;

        for (int i = 0; i < n - 1; i++) {
            swapped = false;
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    //Swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;
                }
            }
            //IF no two elements are swapped by inner loop, then break
            if (!swapped)
                break;
        }
    }

    public static void main(String[] args) {
        int[] arr = {1, 7, 3, -56, 78, 0, 7, 3, 34, -42};
        //Print unsorted array
        System.out.println("Unsorted Array: " + Arrays.toString(arr));
        //Use Bubble Sort
        BubbleSort obj = new BubbleSort();
        obj.bubble_Sort(arr);
        //Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(arr));
    }
}