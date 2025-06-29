import java.util.ArrayList;
import java.util.Collections;

public class sorting_in_AL {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(2);
        list.add(32);
        list.add(6);
        list.add(4);
        list.add(11);

        Collections.sort(list);
        System.out.println(list);

        Collections.sort(list, Collections.reverseOrder());
        System.out.println(list);

    }

}
