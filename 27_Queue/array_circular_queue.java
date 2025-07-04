public class array_circular_queue {
    static class queue {
        static int arr[];
        static int size;
        static int rear;
        static int front;

        queue(int n) {
            arr = new int[n];
            size = n;
            rear = -1;
            front = -1;

        }

        public boolean isempty() {
            return rear == -1 && front == -1;
        }

        // full
        public boolean isfull() {
            return (rear + 1) % size == front;
        }

        // add
        public void add(int data) {
            if (isfull()) {
                System.out.println("Queue is full");
                return;
            }

            // adding first element
            if (front == -1) {
                front = 0;
            }

            rear = (rear + 1) % size;
            arr[rear] = data;
        }

        // remove
        public int remove() {
            if (isempty()) {
                System.out.println("empty queue");
                return -1;
            }

            int result = arr[front];
            // remove last element
            if (rear == front) {
                rear = front = -1;
            } else {
                front = (front + 1) % size;
            }
            return front;
        }

        // peek
        public int peek() {
            if (isempty()) {
                System.out.println("empty queue");
                return -1;
            }
            return arr[front];
        }
    }

    public static void main(String[] args) {
        queue q = new queue(3);
        q.add(1);
        q.add(2);
        q.add(3);
        System.out.println(q.remove());
        q.add(4);
        System.out.println(q.remove());
        q.add(5);

        while (!q.isempty()) {
            System.out.println(q.peek());
            q.remove();
        }

        System.out.println(q.front);
        System.out.println(q.rear);

    }

}