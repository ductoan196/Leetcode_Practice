public class LC21 {
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        ListNode dummy = new ListNode(-9999);
        ListNode current = dummy;

        while (list1 != null && list2 != null){
            //uu tien lay phan tu nho hon de add vao list ket qua
            if (list1.val< list2.val){
                //noi dummy vào list11
                current.next = list1;
                //chuyen current lên list1
                current = list1;
                list1 = list1.next;
            } else {
                current.next = list2;
                current = list2;
                list2 = list2.next;
            }
            //current = current.next;
        }

//        list1 het
        if (list1 != null){
            current.next = list1;
        }
        if (list2 != null){
            current.next = list2;
        }
        return dummy.next;
    }

    static class ListNode{
        int val;
        ListNode next;

        ListNode(int val){
            this.val =val;
        }
    }
}
