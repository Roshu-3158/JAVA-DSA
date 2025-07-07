import java.util.HashMap;
import java.util.Set;

public class iteration_on_hashmap {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insert
        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);
        map.put("Indonesia", 6);
        map.put("Nepal", 5);


        // Iterate 
        Set<String> keys = map.keySet();
        System.out.println(keys);

        // for each loop for iteration 
        for (String k : keys) {
            System.out.println("Key: "+k +" And " + "Value = "+ map.get(k));  
        }
    }
}
