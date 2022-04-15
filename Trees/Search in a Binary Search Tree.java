class Solution {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null || root.val==val)
            return root;
        
        TreeNode pick = root.val>val ? root.left : root.right;
        return searchBST(pick, val);
    }
}