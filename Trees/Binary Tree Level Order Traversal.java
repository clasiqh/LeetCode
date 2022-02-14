
class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>();
        if(root==null)
            return res;

        Queue<TreeNode> x = new LinkedList<>();
        x.add(root);
        while(!x.isEmpty()){
            Queue<TreeNode> temp = new LinkedList<>();
            List<Integer> list = new ArrayList<>();
            while(!x.isEmpty()){
                TreeNode node = x.poll();
                list.add(node.val);
                if(node.left!=null)
                    temp.add(node.left);
                if(node.right!=null)
                    temp.add(node.right);
            }
            res.add(list);
            x = temp;
        }
        return res;
    }
}