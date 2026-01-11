import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Queue2 {
    public static void main(String[] args) {

//        Queue<Double> queue = new PriorityQueue<>(Collections.reverseOrder());
        Queue<Double> queue = new PriorityQueue<>();

        queue.offer(2.5);
        queue.offer(6.5);
        queue.offer(2.8);
        queue.offer(1.9);
        queue.offer(5.9);

        while(!queue.isEmpty()){
            System.out.println(queue.poll());
        }
    }
}
