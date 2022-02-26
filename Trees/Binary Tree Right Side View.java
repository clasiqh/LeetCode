class Solution {
    public List<Integer> rightSideView(TreeNode root) {
        
        List<Integer> res = new ArrayList<>();
        if(root==null)
            return res;
        
        Deque<TreeNode> dq = new ArrayDeque<>();
        dq.add(root);
        while(!dq.isEmpty()){
            int size = dq.size();
            res.add(dq.peekLast().val);
            for(int i=0;i<size;i++){
                TreeNode curr = dq.poll();
                if(curr.left!=null)
                    dq.add(curr.left);
                if(curr.right!=null)
                    dq.add(curr.right);
            }
        }
        
        return res;
    }
}