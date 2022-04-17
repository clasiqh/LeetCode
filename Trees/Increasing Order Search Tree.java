class Solution {
    TreeNode res, temp;

    public TreeNode increasingBST(TreeNode root) {
        if (root == null)
            return root;
        increasingBST(root.left);
        if (res == null) {
            res = new TreeNode(root.val);
            temp = res;
        } else {
            temp.right = new TreeNode(root.val);
            temp = temp.right;
        }
        increasingBST(root.right);
        return res;
    }
}