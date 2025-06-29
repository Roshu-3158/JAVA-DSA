import java.util.*;

public class pair_sum_2 {

    public static boolean brute_force(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size() - 1; i++) {
            for (int j = i + 1; j < list.size(); j++) {
                if (list.get(i) + list.get(j) == target) {
                    return true;
                }

            }
        }
        return false;
    }

    // applied only if given the arraylist is sorted
    public static boolean optimised_approach(ArrayList<Integer> list, int target) {

        int lp = 0;
        int rp = list.size() - 1;

        for (int i = 0; i < list.size() - 1; i++) {

            if (i != list.size()) {
            }
            if (list.get(i) < list.get(i + 1)) {
                rp = i;
                lp = i + 1;
            }
        }

        while (lp != rp) {

            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                // this will be use for rotating array if array is ended by lp or rp 
                lp = (lp + 1) % list.size();
            } else {
                // this will be use for rotating array if array is ended by lp or rp 
                rp = (list.size() + rp - 1) % list.size();
            }
        }
        return false;
    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(11);
        list.add(15);
        list.add(6);
        list.add(8);
        list.add(9);
        list.add(10);

        int target = 24;

        System.out.println(brute_force(list, target));
        System.out.println(optimised_approach(list, target));

    }

}
