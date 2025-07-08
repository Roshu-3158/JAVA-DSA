import java.util.HashSet;

public class hash_set {

    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(1);
        set.add(2);

        System.out.println(set);

        set.remove(2);
        if (set.contains(2)) {
            System.out.println("Contains");
        } else {
            System.out.println("Not Contains");
        }

        System.out.println(set);
        System.out.println(set.size());

        set.clear();
        System.out.println(set);
        System.out.println(set.isEmpty());

    }

}
