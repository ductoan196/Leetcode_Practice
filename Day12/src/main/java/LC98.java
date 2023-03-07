public class LC98 {
    class Solution {
        public boolean isValidBST(TreeNode root) {
            return isValidate(root,null,null);
        }
        private boolean isValidate(TreeNode node, Integer min, Integer max){
            if (node == null){
                return true;
            }
            if ((min!=null&& node.val<=min) || (max!=null&& node.val<=max)){
                return false;
            }
            boolean isLeftValid = isValidate(node.left, min,node.val);
            if (!isLeftValid){
                return false;
            }
            boolean isRightValid = isValidate(node.right,node.val,max);
            if (!isRightValid){
                return false;
            }
            return true;
        }
    }
}
