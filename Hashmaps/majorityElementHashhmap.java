import java.util.*;

public class majorityElementHashhmap {
    public static void majorityElement(int nums[]) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int n = nums.length;
        for (int i = 0; i < n; i++) {       
            if (map.containsKey(nums[i])) {                  //if num is present already
                map.put(nums[i], map.get(nums[i]) + 1);
            } else {                                       //if num is not present 
                map.put(nums[i], 1);
            }
        }
        for (int Key : map.keySet()) {
            if (map.get(Key) > n / 3) {
                System.out.println(" The no. of elements which appeared more than n/3 times is: " + Key);
            }
        }
    }

    public static void main(String[] args) {
        int nums[] = { 1, 3, 2, 5, 1, 3, 1, 5, 1 };
        majorityElement(nums);
    }
}
