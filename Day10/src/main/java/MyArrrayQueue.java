import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;

public class MyArrrayQueue {
    private static final int SIZE = 100;
    static int[] arr;
    static int head;
    static int tail;

    public MyArrrayQueue(){
        arr = new int[SIZE];
    }
//    public static int getSize(){
//        //return size of Queue
//        return tail-head;
//    }
//
//    public static int getFirst(){
//        //return the first element in queue
//        return arr[head];
//    }
//
//    public static int removeFirst(){
//        // remove the first element and return
//        int val = arr[head];
//        head++;
//        return val;
//    }
//
//    public static void push(int val){
//        //add new element into queue
//        arr[tail] = val;
//        tail++;
//    }
//    private static void print(){
//        for (int i = head; i < tail; i++) {
//            System.out.print(arr[i] + "-");
//        }
//    }
//
//    public static void main(String[] args) {
//        arr = new int[SIZE];
//        push(0);
//        push(1);
//        push(2);
//        push(3);
//        System.out.println("remove First " + removeFirst());
//        print();
//        System.out.println("remove First " + removeFirst());
//        print();
//        System.out.println("size " + getSize());
//    }
    private static int getSize1(){
        return tail -head;
    }
    private static void push1(int val){

            arr[tail] = val;
            tail++;
    }
    private static int removeFirst(){
        int val = arr[head];
        head++;
        return val;
    }

}
