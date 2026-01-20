import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedList_vs_ArrayList {
    public static void main(String[] args) {

        LinkedList<Integer> link = new LinkedList<>();
        ArrayList<Integer> arr = new ArrayList<>();

        long startTime;
        long endTime;
        long elapsedTime;

        for(int i = 0;i< 100000;i++){
            link.add(i);
            arr.add(i);
        }
        startTime = System.nanoTime();

        endTime = System.nanoTime();

        elapsedTime = endTime - startTime;

        System.out.println("Linked List : \t"+ elapsedTime + "ns");



    }
}
