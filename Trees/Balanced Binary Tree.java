class Solution {
    boolean ans = true;
    public boolean isBalanced(TreeNode root) {
        helper(root);
        return ans;
    }
    
    int helper(TreeNode root){
        if(root==null)
            return 0;
        int left = helper(root.left) + 1;
        int right = helper(root.right) + 1;
        
        if(Math.abs(right-left)>1)
            ans = false;
        return Math.max(left, right);
    }
}