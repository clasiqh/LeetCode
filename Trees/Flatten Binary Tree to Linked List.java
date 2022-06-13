class Solution {
    
    Deque<TreeNode> x = new ArrayDeque<>();
    
    public void flatten(TreeNode root) {
        helper(root);
        TreeNode last = null;
        while(!x.isEmpty()){
            TreeNode curr = x.pollLast();
            curr.left = null;
            curr.right = last;
            last = curr;
        }
    }
    
    void helper(TreeNode root){
        if(root==null)
            return;
        x.add(root);
        helper(root.left);
        helper(root.right);
    }
}