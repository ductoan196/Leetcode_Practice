import java.util.LinkedList;
import java.util.Queue;

public class MyLinkedListQueue {
    static class Node{
        int val;
        Node next;

        Node(int val){
            this.val =val;
        }
    }

    static int size;
    static Node head,tail;
    public static int getSize(){
        //return size of Queue
        return size;
    }

    public static int getFirst(){
        //return the first element in queue
        return head.val;
    }

    public static int removeFirst(){
        // remove the first element and return
        int val = -1;
        if (head == null){
            return -1;
        }
        if(head ==tail){ //only 1 element
            val = head.val;
            head = head.next;
            tail = tail.next;
        } else {
            val = head.val;
            head = head.next;
        }
        size--;
        return val;
    }

//    public static void push(int val){
//        //add new element into queue
//        Node newNode = new Node(val);
//
//        if (head== null){
//            head = newNode;
//            tail= newNode;
//        } else {
//            tail.next = newNode;
//            tail = tail.next;
//        }
//        size++;
//    }
    private static void print(){
        Node curr = head;
        while (curr != null){
            System.out.print(curr.val + "-");
            curr = curr.next;
        }
    }

    public static void main(String[] args) {
        push(0);
        push(1);
        push(2);
        push(3);
        print();

        removeFirst();
        System.out.println();
        print();
        removeFirst();
        System.out.println();
        print();
    }
    private static void push(int val){
        Node newNode = new Node(val);
        if(head == null){
            head = newNode;
            tail = newNode;
        } else {
            tail.next = newNode;
            tail = tail.next;
        }
    }

}
