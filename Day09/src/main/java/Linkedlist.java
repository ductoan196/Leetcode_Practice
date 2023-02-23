public class Linkedlist {
    public static void main(String[] args) {
        Node n0 = new Node(0);
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);

        n0.next = n1;
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = n5;

//        printList(n4); //0,1,2
//        System.out.println(elementAt(n0,4));
//        insert(n0,4,100);

//        Node newHead = insertAtHead(n0,1000);
//        printList(newHead);

//        printList(insertAtTail(n0, 100));
        deleteAt(n1,2);
        printList(n1);
    }

    private static Node deleteAt(Node head, int index){
        //find element at index-1

        Node current = head;
        int count = 0;
        while (current!= null){
            if (count == index-1){
                //link previous element to next of deleted element
//                Node nodeDelete = current.next;
//                Node afterNodeDelete = nodeDelete.next;
                current.next = current.next.next;
            }
            count ++;
        }
        return head;
    }

    private static Node insertAtTail(Node head, int val) {
        Node newNode = new Node(val);
        //check case list is empty
        if (head == null) {
            return newNode;
        }
        Node current = head;
        while (current != null) {
            current = current.next;
        }
        current.next = newNode;
        return head;
    }

    private static Node insertAtHead(Node head, int val) {
        //creat new node
        Node newNode = new Node(val);
        //link newNode to head
        newNode.next = head;
        return newNode;
        // assign head to newNode
    }


    private static void insert(Node head, int index, int valOfNewNode) {
        //find the node previous of indexNode
        //link newNode to nextNode of previousNode
        //link the previous node to newNode

        Node current = head;
        int count = 0;
        while (current != null) {
            if (count == index - 1) {
                Node newNode = new Node(valOfNewNode);
                newNode.next = current.next;
                current.next = newNode;
                break;
            }
            count++;
            current = current.next;
        }
    }


    private static void printList(Node head) {
        Node current = head; //current point to the Head of List
        while (current != null) {
            System.out.print(current.val + "->");
            ///processs current note complete
            // move to next Node
            current = current.next;
        }
    }


    private static int elementAt(Node head, int index) {
        Node current = head; //current point to the Head of List
        int count = 0;
        while (current != null) {
            if (count == index) {
                return current.val;
            }
            ///processs current note complete
            // move to next Node
            current = current.next;
            count++;
        }
        return -1;
    }

    static class Node {
        public int val;
        public Node next;

        Node(int val) {
            this.val = val;
        }
    }
}
