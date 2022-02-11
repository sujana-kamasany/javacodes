import java.util.Arrays;

//Bubble Sort Algorithm (Generic)
public class BubbleSort<T extends Comparable<? super T>> {
    T[] array;

    BubbleSort(T[] array) {
        this.array = array;
    }

    private void bubbleSort() {
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j].compareTo(array[j + 1]) > 0) {
                    swapElements(j, array);
                }
            }
        }
    }

    private void swapElements(int index, T[] arr) {
        T temp = arr[index];
        arr[index] = arr[index + 1];
        arr[index + 1] = temp;
    }

    public static void main(String[] args) {
        //EXAMPLE Type Int
        Integer[] intArr = {1, 2, 7, 3, -56, 78, 0, 7, 3, 34, -42};
        //Print unsorted array
        System.out.println("Unsorted Array: " + Arrays.toString(intArr));
        //Use Bubble Sort
        BubbleSort<Integer> obj = new BubbleSort<>(intArr);
        obj.bubbleSort();
        //Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(intArr));

        //EXAMPLE Type String
        String[] strArr = {"Mate", "Awais", "Eduardo", "Thierry", "Bence"};
        System.out.println("Unsorted Array: " + Arrays.toString(strArr));
        //Use Bubble Sort
        BubbleSort<String> obj1 = new BubbleSort<>(strArr);
        obj1.bubbleSort();
        //Print sorted array
        System.out.println("Sorted array: " + Arrays.toString(strArr));
    }
}