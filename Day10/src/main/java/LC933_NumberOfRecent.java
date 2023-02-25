import java.util.LinkedList;
import java.util.Queue;

public class LC933_NumberOfRecent {
    Queue<Integer> queue;

    public LC933_NumberOfRecent() {
        queue = new LinkedList<>();
    }

    public int ping(int t) {
        while (!queue.isEmpty()&& t-queue.peek()>3000){
            queue.poll();
        }
        queue.offer(t);
        return queue.size();
    }
}
