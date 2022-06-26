class FindElements {
    HashSet<Integer> x = new HashSet<>();

    public FindElements(TreeNode root) {
        helper(root, 0);
    }

    void helper(TreeNode root, int curr) {
        if (root == null)
            return;
        x.add(curr);
        helper(root.left, 2 * curr + 1);
        helper(root.right, 2 * curr + 2);
    }

    public boolean find(int target) {
        return x.contains(target);
    }
}