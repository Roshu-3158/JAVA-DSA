import java.util.HashSet;
import java.util.LinkedHashSet;

public class linked_hashset {
    public static void main(String[] args) {
        HashSet<String> cities = new HashSet<>();
        cities.add("Mumbai");
        cities.add("Delhi");
        cities.add("Noida");
        cities.add("Pune");
        System.out.println(cities);

        LinkedHashSet<String> lhs = new LinkedHashSet<>();
        lhs.add("Mumbai");
        lhs.add("Delhi");
        lhs.add("Noida");
        lhs.add("Pune");
        System.out.println(lhs);

    }
}
