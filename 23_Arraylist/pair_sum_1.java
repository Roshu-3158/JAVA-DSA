import java.util.*;

public class pair_sum_1 {

    public static boolean brute_force(ArrayList<Integer> list, int target) {
        for (int i = 0; i < list.size()-1; i++) {
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

        while (lp != rp) {

            if (list.get(lp) + list.get(rp) == target) {
                return true;
            }
            if (list.get(lp) + list.get(rp) < target) {
                lp++;
            } else {
                rp--;
            }
        }
        return false;

    }

    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);

        int target = 4;

        System.out.println(brute_force(list, target));
        System.out.println(optimised_approach(list, target));

    }

}
