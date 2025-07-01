public class LinkedList_2 {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    };

    public static Node head;
    public static Node tail;
    public static int size;

    // delete a loop/cycle in a LL
    // Floyd`s cycle finding algorithm = slow - fast approach

    public boolean iscycle() {

        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                return true;
            }
        }
        return false;
    }

    // print a linked list
    public void print() {
        if (head == null) {
            System.out.println("Linked list is empty");
            return;
        }

        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;
        }
        System.out.print("null");

    }

    public void removecycle() {
        Node slow = head;
        Node fast = head;

        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast) {
                System.out.println("Cycle found at node with value: " + slow.data + " -> " + slow.next.data);
                slow.next.next.next = null;
                return;
            }
        }
        System.out.println("No cycle found in the linked list.");

    }

    public static void main(String[] args) {
        LinkedList_2 ll = new LinkedList_2();
        head = new Node(1);
        Node temp = new Node(2);
        head.next = temp;
        head.next.next = new Node(3);
        head.next.next.next = temp;

        System.out.println("Is cycle present in LL : " + ll.iscycle());
        ll.removecycle();
        ll.print();

    }
}
