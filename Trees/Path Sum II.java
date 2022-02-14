
class Solution {
    List<List<Integer>> x = new ArrayList<>();
    public List<List<Integer>> pathSum(TreeNode root, int targetSum) {
        
        helper(root, targetSum, 0, new ArrayList<>());
        return x;
    }
    
    void helper(TreeNode root, int target, int sum, List<Integer> temp){
        if(root==null)
            return;
        temp.add(root.val);
        sum+=root.val;
        if(root.left==null && root.right==null){
            if(sum==target)
                x.add(new ArrayList<>(temp));
            temp.remove(temp.size()-1);
            return;
        }
        helper(root.left, target, sum, temp);
        helper(root.right, target, sum, temp);
        temp.remove(temp.size()-1);
    }
}