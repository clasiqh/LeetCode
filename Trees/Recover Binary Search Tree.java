class Solution {
    TreeNode one = null, two = null, prev = new TreeNode(Integer.MIN_VALUE);

    public void recoverTree(TreeNode root) {
        helper(root);
        one.val += two.val;
        two.val = one.val - two.val;
        one.val -= two.val;
    }

    void helper(TreeNode root) {
        if (root == null)
            return;
        helper(root.left);
        if (one == null && prev.val > root.val)
            one = prev;
        if (one != null && prev.val > root.val)
            two = root;
        prev = root;
        helper(root.right);
    }
}