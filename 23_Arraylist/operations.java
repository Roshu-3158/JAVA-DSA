import java.util.ArrayList;

public class operations {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        // ArrayList<String> list2 = new ArrayList<>();
        // ArrayList<Boolean> list3 = new ArrayList<>();

        // Add element - O(1)
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        System.out.println(list);

        // add at index
        list.add(1, 9);
        System.out.println(list);

        // Get operations - O(1)
        int element = list.get(2);
        System.out.println(element);

        // remove element - O(n)
        list.remove(2);
        System.out.println(list);

        // set element at index - O(n)
        // first check the length of arraylist then only set - if you assign index more
        // than length then array index out of boud error comes
        list.set(2, 8);
        System.out.println(list);

        // contanins - O(n)
        System.out.println(list.contains(1));
        System.out.println(list.contains(11));

        System.out.println("Size : " + list.size());

        // itterate and print arraylist elements
        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i) + " ");
        }

        System.out.println();

        // print reverse arraylist
        for (int i = list.size()-1 ; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }

    }

}
