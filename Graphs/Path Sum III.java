class Solution {
    int res = 0, target;
    HashSet<TreeNode> visited = new HashSet<>();

    public int pathSum(TreeNode root, int targetSum) {
        this.target = targetSum;
        helper(root, 0);
        return res;
    }

    void helper(TreeNode root, int sum) {
        if (root == null)
            return;
        visited.add(root);
        sum += root.val;
        if (sum == target)
            res++;

        if (!visited.contains(root.left))
            helper(root.left, 0);
        helper(root.left, sum);

        if (!visited.contains(root.right))
            helper(root.right, 0);
        helper(root.right, sum);
    }
}