package Day13_FINALTEST;

public class LC160 {
    //Bài toán yêu cầu tìm node giao nhau của hai linked list.
    // Độ phức tạp thuật toán của bài toán này là O(m + n)
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode p = headA;
        ListNode q = headB;
        while (p != q) {
            p = p == null ? headB : p.next;
            q = q == null ? headA : q.next;
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
