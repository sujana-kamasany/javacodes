import java.util.Arrays;
public class ArrayTest {

   public static void main(String[] args) {
      // sorted array
      int arr[] = {10, 10, 20, 30, 40, 40, 50};
      
      // remove duplicates
      int newArr[] = removeDuplicates(arr);
      
      // display both arrays
      System.out.println("Original array: "
                     + Arrays.toString(arr));
      System.out.println("After removing duplicates: " 
                     + Arrays.toString(newArr));
      
   }
   
   // method to remove duplicates from sorted array
   public static int[] removeDuplicates(int[] arr) {
      
      int j = 0; // index without duplicates
      int lastIndex = arr.length-1; 
      
      // loop to iterate the array (except last element)
      for (int i = 0; i < lastIndex; i++) {
         if(arr[i] != arr[i+1]) {
            arr[j++] = arr[i];
         }
      }
      
      // for the last element
      if(arr[j] != arr[lastIndex])
         arr[j++] = arr[lastIndex];
      
      // return new copied array
      return Arrays.copyOf(arr, j);
   }
}
