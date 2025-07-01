import java.util.LinkedList;

public class LL_collection_framework {
    public static void main(String[] args) {
        // create - use only classes while creating a LinkedList
        LinkedList<Integer> ll = new LinkedList<>();

        // add
        ll.addLast(1);
        ll.addLast(2);
        ll.addFirst(0);

        // print
        System.out.println("LinkedList: " + ll);
        
        // remove
        ll.removeLast(); // removes the last element
        System.out.println("Linke dList: " + ll);
        ll.removeFirst(); // removes the first element


        // print
        System.out.println("LinkedList: " + ll);
    }
}