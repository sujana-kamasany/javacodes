package sorting;

/**
 * Heap sort is a comparison-based sorting technique based on Binary Heap data structure.<br>
 * The algorithm below works with any array of elements that implements Comparable<br><br>
 *
 * Time complexity: O(n log n)<br>
 * Space complexity: O(1)
 */
public class HeapSort<T extends Comparable<T>> {

    public void sort(T[] array) {
        int lastIndex = array.length - 1;
        buildHeap(array, lastIndex);
        swap(array, 0, lastIndex--);
        while (lastIndex > 0) {
            heapify(array, 0, lastIndex);
            swap(array, 0, lastIndex);
            lastIndex--;
        }
    }

    /**
     * Transform the array into a max-heap.
     */
    private void buildHeap(T[] array, int lastIndex) {
        for (int i = parent(lastIndex); i >= 0; i--) {
            heapify(array, i, lastIndex);
        }
    }

    /**
     * Rearranges the array to be a max-heap.
     *
     * @param array which is heapify.
     * @param iFather father node index.
     */
    private void heapify(T[] array, int iFather, int lastIndex) {
        int iLeft = leftChild(iFather);
        int iRight = rightChild(iFather);
        int iBigger;
        if (iLeft <= lastIndex && biggerThan(array[iLeft], array[iFather]))
            iBigger = iLeft;
        else
            iBigger = iFather;
        if (iRight <= lastIndex && biggerThan(array[iRight], array[iBigger]))
            iBigger = iRight;
        if (iBigger != iFather) {
            swap(array, iBigger, iFather);
            heapify(array, iBigger, lastIndex);
        }
    }

    /**
     * Return father node index
     *
     * @param iChild child node index
     */
    private int parent(int iChild) {
        return (iChild - 1) >> 1;
    }

    /**
     * Return left child node index
     *
     * @param iFather father node index
     */
    private int leftChild(int iFather) {
        return (iFather << 1) + 1;
    }

    /**
     * Return right child node index
     *
     * @param iFather father node index
     */
    private int rightChild(int iFather) {
        return (iFather + 1) << 1;
    }

    /**
     * Swaps the position of two elements
     *
     * @param array that will have swapped elements
     * @param i1 index first element.
     * @param i2 index second element.
     */
    private void swap(T[] array, int i1, int i2) {
        T aux = array[i1];
        array[i1] = array[i2];
        array[i2] = aux;
    }

    /**
     * Compare if {@code o1} is greater than {@code o2}.
     *
     * @return {@code true} case o1 is bigger than o2, {@code false} otherwise.
     */
    private boolean biggerThan(T o1, T o2){
        return o1.compareTo(o2) > 0;
    }

}
