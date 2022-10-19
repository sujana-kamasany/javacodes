package arrays;

public class SwapElements {

// it shifts all the elements in given array to the right by 1 position
    static void cycleSwap(int[] array) {
        if(array.length == 0){
            return;
        }
        int temp = array[array.length - 1];
        for(int i = array.length - 2; i > -1; i--){
            array[i + 1] = array[i];
        }
        array[0] = temp;
    }

//    it shifts all the elements in the given array to the right direction by specified numbers of postion
    static void cycleSwap(int[] array, int shift) {
        if(array.length == 0){
            return;
        }
        for(int j = 1; j <= shift; j++){
            int temp = array[array.length - 1];
            for(int i = array.length - 2; i > -1; i--){
                array[i + 1] = array[i];
            }
            array[0] = temp;
        }
    }
}
