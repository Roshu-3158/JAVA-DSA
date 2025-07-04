public class using_linked_list {
    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    static class queue {
        static Node head = null;
        static Node tail = null;

        public boolean isempty() {
            return head == null && tail == null;
        }

        // add
        public void add(int data) {
            Node newnNode = new Node(data);
            if (head == null) {
                head = tail = newnNode;
                return;
            } else {
                tail.next = newnNode;
                tail = newnNode;
            }

        }

        // remove
        public int remove() {
            if (isempty()) {
                System.out.println("empty queue");
                return -1;
            }

            int front = head.data;
            if (tail == head) {
                tail = head = null;
            } else {
                head = head.next;
            }
            return front;
        }

        // peek
        public int peek() {
            if (isempty()) {
                System.out.println("empty queue");
                return -1;
            }
            return head.data;
        }
    }

    public static void main(String[] args) {
        queue q = new queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }

    }

}