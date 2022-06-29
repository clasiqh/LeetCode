class BSTIterator {

    Stack<TreeNode> x = new Stack<>();
    public BSTIterator(TreeNode root){
        addLeft(root);
    }
    
    void addLeft(TreeNode root){
        for(; root!=null; x.add(root), root = root.left){}
    }
    
    public int next() {
        TreeNode curr = x.pop();
        addLeft(curr.right);
        return curr.val;
    }
    
    public boolean hasNext() {
        return !x.isEmpty();
    }
}