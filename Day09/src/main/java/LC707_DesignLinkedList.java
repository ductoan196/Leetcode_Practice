import org.w3c.dom.Node;

public class LC707_DesignLinkedList {
    int size;
    Node head;

    public void MyLinkedList() {

    }

    public int get(int index) {
        Node current = head;
        int count = 0;
        while (current != null){
            if (count == index){
                return current.val;
            }
            current = current.next;
            count++;
        }
        return -1;
    }

    public void addAtHead(int val) {
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
        size++;
    }

    public void addAtTail(int val) {
        Node newNode = new Node(val);
        if (head ==null){
            head = newNode;
        } else {
            Node current = head;
            while (current.next!= null){
                current = current.next;
            }
            current.next = newNode;
        }
        size ++;
    }

    public void addAtIndex(int index, int val) {
        if (index ==0){
            addAtHead(val);
        } else if (index<size) {
            addAtTail(val);
        } else if (index<size) {
            Node current = head;
            int count = 0;
            while (current!=null){
        }
    }

    public void deleteAtIndex(int index) {

    }

    static class Node {
        public int val;
        public Node next;

        Node(int val) {
            this.val = val;
        }
    }
}
