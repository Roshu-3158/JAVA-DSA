import java.util.PriorityQueue;

public class priority_queue {

    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        pq.add(1);
        pq.add(4);
        pq.add(3);
        pq.add(7);


        while (!pq.isEmpty()) {
            System.out.print(pq.peek() + " ");
            pq.remove();
        }
    }
    
}
