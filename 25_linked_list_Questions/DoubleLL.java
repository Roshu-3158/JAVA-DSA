public class DoubleLL {

    public class Node {
        int data;
        Node next;
        Node prev;

        public Node(int data) {
            this.data = data;
            this.next = null;
            this.prev = null;
        }
    }

    public static Node head;
    public static Node tail;
    public static int size;

    // add
    // addfirst
    public void addfirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head.prev = newNode;
        head = newNode;

    }

    // addlast
    public void addlast(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode; // link
        newNode.prev = tail; // link
        tail = newNode; // update tail
    }

    public void print() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " <-> ");
            temp = temp.next;
        }
        System.out.println("null");
    }

    // remove

    // removefirst
    public void removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
        }
        head = head.next; // update head
        head.prev = null; // remove first node
        size--;

    }

    // removelast
    public void removelast() {
        if (size == 0) {
            System.out.println("LL is empty");
        }
        Node temp = head;
        while (temp.next != null) {
            temp = temp.next;
        }
        tail = temp.prev; // update tail
        temp.prev.next = null; // remove last node
        size--;
    }

    // reverse a link list
    public void reverse() {
        Node curr = head;
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            curr.prev = next;

            prev = curr;
            curr = next;
        }
        head = prev;
    }

    

    public static void main(String[] args) {
        DoubleLL dll = new DoubleLL();
        dll.addfirst(10);
        dll.addfirst(20);
        dll.addfirst(30);
        dll.addfirst(40);
        dll.addlast(50);
        dll.print();
        System.out.println();
        dll.removelast();
        dll.print();
        System.out.println();
        dll.removeFirst();
        dll.print();
        System.out.println();
        dll.reverse();
        dll.print();

    }

}
