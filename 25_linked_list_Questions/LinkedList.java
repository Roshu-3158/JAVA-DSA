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

    // reverse a linked list iterrative approach
    public Node reverse_iterative(Node head) {
        if (head == null || head.next == null) {
            return head; // base case
        }

        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr != null) {
            next = curr.next; // store next node
            curr.next = prev; // reverse the link
            prev = curr; // move prev to current node
            curr = next; // move to next node
        }

        head = prev; // update head to the new first node
        return head;
    }

    // find and remove nth node from the end iterative approach
    public void removeNthFromEnd(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            sz++;
            temp = temp.next;
        }

        if (n == sz) {
            head = head.next; // remove first node
            return;
        }

        int i = 1;
        int indexToRemove = sz - n;
        Node prev = head;
        while (i < indexToRemove) {
            prev = prev.next; // move to the node before the one to remove
            i++;
        }

        prev.next = prev.next.next; // skip the node to remove

    }

    // check if LL is a palindrome
    public boolean isPalindrome() {
        if (head == null || head.next == null) {
            return true; // empty or single node list is a palindrome
        }

        // find the middle of the linked list
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // reverse the second half of the linked list
        Node prev = null;
        Node curr = slow;
        while (curr != null) {
            Node nextNode = curr.next;
            curr.next = prev;
            prev = curr;
            curr = nextNode;
        }

        // compare the first half and the reversed second half
        Node firstHalf = head;
        Node secondHalf = prev; // this is now the head of the reversed second half
        while (secondHalf != null) {
            if (firstHalf.data != secondHalf.data) {
                return false; // not a palindrome
            }
            firstHalf = firstHalf.next;
            secondHalf = secondHalf.next;
        }

        return true; // is a palindrome
    }

    private Node getMid(Node head) {
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow; // mid
    }

    // merge
    private Node merge(Node head1, Node head2) {
        Node mergedLL = new Node(-1);
        Node temp = mergedLL;

        while (head1 != null && head2 != null) {
            if (head1.data <= head2.data) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            } else {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;

            }
        }

        while (head1 != null) {
            temp.next = head1;
            head1 = head1.next;
            temp = temp.next;
        }

        while (head2 != null) {
            temp.next = head2;
            head2 = head2.next;
            temp = temp.next;
        }
        return mergedLL.next;
    }

    public Node mergeSort(Node head) {
        // if only one node or empty LL
        if (head == null || head.next == null) {
            return head;
        }
        Node mid = getMid(head);
        // left & right MS
        Node righthead = mid.next;
        mid.next = null;
        Node newLeft = mergeSort(head);
        Node newRight = mergeSort(righthead);

        // Merge
        return merge(newLeft, newRight);
    }

    // zig zag LL 
    public Node zigzag(Node head){
        // get mid 
        Node slow = head;
        Node fast = head.next;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        Node mid = slow; // mid node

        // reverse second half 
        Node curr = mid.next;
        mid.next = null; // break the list into two halves
        Node prev = null;
        Node next;

        while (curr != null) {
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }


        Node left = head; // first half
        Node right = prev; // reversed second half
        Node nextLeft, nextRight;

        // alt merge zig zag merge 
        while (left !=null && right != null) {
            nextLeft = left.next;
            left.next = right;
            nextRight = right.next;
            right.next = nextLeft;

            left = nextLeft; // move to next node in first half
            right = nextRight; // move to next node in second half
        }
        return head; // return the head of the zigzagged list
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(1);
        ll.addFirst(2);
        ll.addFirst(3);
        ll.addFirst(4);
        ll.addFirst(5);
        System.out.println("Unsorted Linked List:");
        ll.print();

        System.out.println("\nSorted Linked List:");
        head = ll.mergeSort(head);
        ll.print();
        System.out.println("\nzig zag Linked List:");
        ll.zigzag(head);
        ll.print();


    }

}
