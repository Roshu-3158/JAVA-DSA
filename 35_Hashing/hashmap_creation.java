import java.util.HashMap;

public class hashmap_creation {

    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();

        // Insert
        map.put("India", 100);
        map.put("China", 150);
        map.put("US", 50);

        // unordered
        System.out.println(map);

        // get : get the value from the key
        int population = map.get("India");
        System.out.println(population);

        // containskey
        System.out.println(map.containsKey("India"));
        System.out.println(map.containsKey("india"));

        // remove data
        System.out.println(map.remove("China"));
        System.out.println(map);

        // size
        System.out.println(map.size());

        // clear : clear all data
        map.clear();

        // is empty 
        System.out.println(map.isEmpty());
    }

}
