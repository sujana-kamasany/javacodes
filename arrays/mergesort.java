import java.util.Arrays;

public class mergesort {

   public static void main(String[] args) {
      
      // array which should be merged
      int src1[] = {10, 20, 30, 40, 50};
      int src2[] = {9, 18, 27, 36, 45};
      
      // create new array 
      int newArray[] = new int[src1.length + src2.length];
      
      // Copy first to new array from 0 to src1.length
      System.arraycopy(src1, 0, newArray, 0, src1.length);
      // copy second array to new array
      System.arraycopy(src2, 0, newArray, src1.length, src2.length);
      
      // sort new array
      Arrays.sort(newArray);
      
      // display all array
      System.out.println("Array1 = " + Arrays.toString(src1));
      System.out.println("Array2 = " + Arrays.toString(src2));
      System.out.println("Merged Array = " 
                      + Arrays.toString(newArray));
   }
}
