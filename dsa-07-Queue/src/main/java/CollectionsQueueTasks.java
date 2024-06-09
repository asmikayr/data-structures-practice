import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;


public class CollectionsQueueTasks {

    public static void main(String[] args) {
        Deque<Integer> queue = new ArrayDeque<>();
        PriorityQueue<String> priorityQueue = new PriorityQueue<>();

        priorityQueue.add("John");
        priorityQueue.add("Michael");
        priorityQueue.add("Carol");
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
        System.out.println(priorityQueue.remove());
    }
}
