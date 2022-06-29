class Solution {

    int res = 0;

    public int diameterOfBinaryTree(TreeNode root) {
        helper(root);
        return res - 2;
    }

    int helper(TreeNode root) {
        if (root == null)
            return 0;
        int left = helper(root.left) + 1;
        int right = helper(root.right) + 1;
        res = Math.max(res, left + right);
        return Math.max(left, right);
    }
}