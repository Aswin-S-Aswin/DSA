import java.util.LinkedList;

public class LinkedList_1 {

    public static void main(String[] args) {
        LinkedList<String> link = new LinkedList<>();

        link.offer("A");
        link.offer("B");
        link.offer("D");
        link.offer("F");

        link.add(4,"E");
        link.remove("E");

        System.out.println(link);

        System.out.println(link.peekFirst());
        System.out.println(link.peekLast());

        System.out.println(link);

        link.addLast("1");
        link.addFirst("0");

        System.out.println(link);

        link.removeLast();
        link.removeFirst();

        System.out.println(link);
    }

}
