import java.util.LinkedList;
import java.util.Queue;

public class queue {
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList<>();

        queue.offer("1"); // Enqueue
        queue.offer("2"); // Enqueue
        queue.offer("3"); // Enqueue

        queue.poll(); // Dequeue

        queue.peek(); // 가장 앞에 있는 요소 반환


        queue.clear(); // Queue 요소 전체삭제


    }
}
