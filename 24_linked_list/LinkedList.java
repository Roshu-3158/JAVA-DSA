public class LinkedList {
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

    // add at starting
    public void addFirst(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 = newNode next = head
        newNode.next = head; // link

        // step 3 = head = newnode
        head = newNode;
    }

    public void addLast(int data) {
        // step 1 = create new node
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }

        // step 2 = newNode next = head
        tail.next = newNode; // link

        // step 3 = head = newnode
        tail = newNode;
    }

    // add at the perticular index
    public void addindex(int data, int index) {
        if (index == 0) {
            addFirst(data);
            return;
        }

        // step 1 = create new node
        Node newNode = new Node(data);
        size++;

        Node temp = head;
        for (int i = 0; i < index - 1; i++) {
            temp = temp.next;
        }

        newNode.next = temp.next;
        temp.next = newNode;

    }

    // remove first
    public int removeFirst() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            return val;
        }
        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    // remove last
    public int removeLast() {
        if (size == 0) {
            System.out.println("LL is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = tail.data;
            head = tail = null;
            return val;
        }
        Node temp = head;
        while (temp.next != tail) {
            temp = temp.next;
        }
        int val = tail.data; // prev.next.data
        temp.next = null;
        tail = temp;
        size--;
        return val;
    }

    // serach iterative
    public int search_iterative(int key) {
        Node temp = head;
        for (int i = 0; i < size; i++) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
        }

        return -1;
    }

    public int search_recursive(Node head, int key) {
        // base case
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }

        // recursive case
        int index = search_recursive(head.next, key);
        if (index == -1) {
            return -1;
        } else {
            return index + 1; // increment index for the current node
        }
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

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.print();
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(3);
        ll.addLast(4);
        ll.print();
        System.out.println();
        ll.addindex(2, 2);
        ll.print();
        System.out.println();
        System.out.println("Size of LL : " + size);

        System.out.println("Deleted Node : " + ll.removeFirst());
        ll.print();
        System.out.println();
        System.out.println("Deleted Node : " + ll.removeLast());
        ll.print();
        System.out.println();
        System.out.println("Size of LL : " + size);
        System.out.println();
        System.out.println("Key found at index : " + ll.search_iterative(3));
        System.out.println("Key found at index : " + ll.search_recursive(head, 2));
     

    }

}
