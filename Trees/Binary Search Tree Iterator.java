class BSTIterator {
    
    Queue<Integer> x = new LinkedList<>();
    int i = 0;

    public BSTIterator(TreeNode root) {
        InOrder(root);
    }
    
    public int next() {
        return x.poll();
    }
    
    public boolean hasNext() {
        return x.size()!=0;
    }
    
    void InOrder(TreeNode root){
        if(root==null)
            return;
        InOrder(root.left);
        x.add(root.val);
        InOrder(root.right);
    }
}