import java.util.LinkedList;
import java.util.List;

public class LC144 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> rs = new LinkedList<>();
        preOrder(root,rs);
        return rs;
    }
    private void preOrder(TreeNode root, List<Integer> rs){
        if (root == null){
            return;
        }
        rs.add(root.val);
        preOrder(root.left,rs);
        preOrder(root.right,rs);
    }
}
