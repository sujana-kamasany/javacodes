import java.lang.Math.*;
 
class GFG {
    static void mergeSort(int arr[], int n)
    {
        int curr_size;               
        int left_start;
        for (curr_size = 1; curr_size <= n-1;
                      curr_size = 2*curr_size)
        {
            for (left_start = 0; left_start < n-1;
                        left_start += 2*curr_size)
            {
                int mid = Math.min(left_start + curr_size - 1, n-1);
         
                int right_end = Math.min(left_start
                             + 2*curr_size - 1, n-1);
                merge(arr, left_start, mid, right_end);
            }
        }
    }
    static void merge(int arr[], int l, int m, int r)
    {
        int i, j, k;
        int n1 = m - l + 1;
        int n2 = r - m;
     
        /* create temp arrays */
        int L[] = new int[n1];
        int R[] = new int[n2];
        for (i = 0; i < n1; i++)
            L[i] = arr[l + i];
        for (j = 0; j < n2; j++)
            R[j] = arr[m + 1+ j];     
        i = 0;
        j = 0;
        k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                arr[k] = L[i];
                i++;
            }
            else
            {
                arr[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            arr[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            arr[k] = R[j];
            j++;
            k++;
        }
    }
    static void printArray(int A[], int size)
    {
        int i;
        for (i=0; i < size; i++)
            System.out.printf("%d ", A[i]);
        System.out.printf("\n");
    }
    public static void main(String[] args)
    {
        int arr[] = {12, 11, 13, 5, 6, 7};
        int n = arr.length;
     
        System.out.printf("Given array is \n");
        printArray(arr, n);
     
        mergeSort(arr, n);
     
        System.out.printf("\nSorted array is \n");
        printArray(arr, n);
    }
}
