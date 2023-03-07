package Day13_FINALTEST;

public class LC100 {

    //Hai cây same tree nếu các nút có cùng vị trí và cùng giá trị
    //Sử dụng đệ quy để xét các nút và các nhánh
    //Độ phức tạp thuật toán là O(n) với n là số lượng nút trong cây
    public boolean isSameTree(TreeNode p, TreeNode q) {
        if (p == null && q == null) {
            return true;
        }

        //trường hợp chỉ có một trong 2 null thì sẽ trả về false
        if (p==null&& q!=null || q==null &&p!=null) {
            return false;
        }
        if (q.val!=p.val){ //kiểm tra tại nút đang xét
            return false;
        }

        //nếu không nằm trong các TH trên thì đệ quy các subtree
        return isSameTree(p.right, q.right) && isSameTree(p.left, q.left);
    }


    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;

        TreeNode() {
        }

        TreeNode(int val) {
            this.val = val;
        }

        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }
}
