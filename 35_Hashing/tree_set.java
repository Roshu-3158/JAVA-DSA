import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.TreeSet;

public class tree_set {
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


        TreeSet<String> ts = new TreeSet<>();
        ts.add("Mumbai");
        ts.add("Delhi");
        ts.add("Noida");
        ts.add("Pune");
        System.out.println(ts);

    }
}
