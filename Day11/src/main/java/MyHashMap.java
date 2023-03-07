import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;

public class MyHashMap {
    private static final int SIZE = 10000;
    private List<Node>[] buckets;

    public MyHashMap() {
        //arrays of buckets
        buckets = new List[SIZE];
        for (int i = 0; i < SIZE; i++) {
            buckets[i] = new LinkedList<>();
        }
    }

    public void put(int key, int value) {
        //biến key thành 1 index: hashFunction
        int hashIndex = hashFunction(key);
        //lấy ra bucket để chưa
        List<Node> bucket = buckets[hashIndex];
        if (bucket==null){
            List<Node> newBucket = new LinkedList<>();
            buckets[hashIndex] = newBucket;
            bucket = newBucket;
        }

        //nếu buckets chưa có key nay
        //check xem bucket có node key này chưa
        Node node = new Node(key,value);
        int indexOfKey = bucket.indexOf(node);
        if (indexOfKey==-1){
            //bucket đã có key này, chỉ việc add
            bucket.add(node);
        } else {
            bucket.get(indexOfKey).value= value;
        }
//        if (bucket.contains(node)){
//            //bucket đã chứa key này rồi
//            //ghi đè giá trị value mới
//            int indexOfKey = bucket.indexOf(node);
//            bucket.get(indexOfKey).value = value;
//        } else {
//            //chưa có key này, chỉ việc add thôi
//        }
        //nếu buckets đã có key này
    }

    public int get(int key) {
        //tìm hash indexx
        int hashIndex = hashFunction(key);
        List<Node>  bucket = buckets[hashIndex];
        //nếu buckets chưa có key nay
        //check xem bucket có node key này chưa
        Node node = new Node(key,-1);
        int indexOfKey = bucket.indexOf(node);
        if (indexOfKey==-1){
            //bucket chưa có key ny, return -1
            return -1;
        } else {
            //bucket có key này, return value
           return bucket.get(indexOfKey).value;
        }
    }

    public void remove(int key) {
        int hashIndex = hashFunction(key);
        List<Node>  bucket = buckets[hashIndex];
        Node node = new Node(key,-1);
//        int indexOfKey = bucket.indexOf(node);
        bucket.remove(node);
    }

    //hash
    private int hashFunction(int key){
        //SIZE = 10000
        //key = 5 -> 5
        //key = 10005 -> 5 ->collision
        //key = 10001 -> 1 ->collision
        //example: key= 100 -> 100

        return key%SIZE;
    }
    static class Node{
        public int key, value;

        public Node(int key, int value){
            this.key = key;
            this.value= value;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Node node = (Node) o;
            return this.key == node.key;
        }
        //object 1 equal vs object 2 khi 2 thang la 1, tro de cung 1 object trong bo nho, cung dia chi
        //implement equa:
        //co the cho phep 2 object = nhau khi content cua no giong nhau mà khong can phải cùng object hay cùng địa chỉ
    }
}
