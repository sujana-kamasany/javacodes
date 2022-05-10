
package Basics;
import java.util.*;

 class HashMapToList {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        map.put("Hello", 0);
        map.put("Word", 1);
        List<String> keys = new ArrayList<>(map.keySet());
        List<Integer> values = new ArrayList<>(map.values());
    }
}
