package Day13_FINALTEST;

public class LC160 {
    //Bài toán yêu cầu tìm node giao nhau của hai linked list.
    // Độ phức tạp thuật toán của bài toán này là O(m + n)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA; //Sử dụng 2 con trỏ p, q cho 2 list
        ListNode q = headB;
        while (p != q) { //run đến khi p =q, nếu không có thì sẽ trả về null
            if (p == null) {
                p = headB;
            } else {
                p = p.next;
            }
            if (q == null) {
                q = headA;
            } else {
                q = q.next;
            }
        }
        return p;
    }


    public class ListNode {
        int val;
        ListNode next;

        ListNode(int x) {
            val = x;
            next = null;
        }
    }
}
