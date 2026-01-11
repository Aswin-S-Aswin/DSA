import java.util.LinkedList;
import java.util.Queue;

public class Queue1 {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("Keran");
        queue.offer("Chad");
        queue.offer("Steve");
        queue.offer("Harolds");

//It uses FIFO method (First in First out)
        System.out.println(queue.peek());

        System.out.println(queue.size());

        System.out.println(queue);

        System.out.println("This is been removed : "+ queue.poll());
//        queue.poll();

        System.out.println(queue.peek());

        System.out.println(queue.isEmpty());

        System.out.println(queue.contains("Steve"));
    }
}
