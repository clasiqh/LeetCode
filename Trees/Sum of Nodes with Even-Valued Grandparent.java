class Solution {

    int sum = 0;

    public int sumEvenGrandparent(TreeNode root) {
        helper(root, 1, 1);
        return sum;
    }

    void helper(TreeNode curr, int parent, int grandparent) {
        if (curr == null)
            return;
        if (grandparent % 2 == 0)
            sum += curr.val;
        helper(curr.left, curr.val, parent);
        helper(curr.right, curr.val, parent);
    }
}