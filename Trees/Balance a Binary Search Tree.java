class Solution {
    List<Integer> x = new ArrayList<>();

    public TreeNode balanceBST(TreeNode root) {
        inOrder(root);
        return build(0, x.size() - 1);
    }

    TreeNode build(int left, int right) {
        if (left > right)
            return null;
        int mid = left + (right - left) / 2;
        return new TreeNode(x.get(mid), build(left, mid - 1), build(mid + 1, right));
    }

    void inOrder(TreeNode root) {
        if (root == null)
            return;
        inOrder(root.left);
        x.add(root.val);
        inOrder(root.right);
    }
}