import java.util.LinkedList;
import java.util.List;

public class MyHashSet {
    private static final int SIZE = 1000;
    private List<Node>[] buckets;
    public MyHashSet() {
        buckets = new List[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void add(int key) {

    }

    public void remove(int key) {

    }

    public boolean contains(int key) {

    }
}
