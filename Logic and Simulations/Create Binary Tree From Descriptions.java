class Solution {
    public TreeNode createBinaryTree(int[][] descriptions) {
        HashMap<Integer, TreeNode> x = new HashMap<>();
        HashSet<TreeNode> par = new HashSet<>();
        for(int [] arr : descriptions){
            if(!x.containsKey(arr[0])){
                x.put(arr[0], new TreeNode(arr[0]));
                par.add(x.get(arr[0]));
            }
            TreeNode curr = x.get(arr[0]);

            if(!x.containsKey(arr[1]))
                x.put(arr[1], new TreeNode(arr[1]));
            else par.remove(x.get(arr[1]));

            TreeNode add = x.get(arr[1]);
            if(arr[2]==1) curr.left = add;
            else curr.right = add;
        }
        return par.iterator().next();
    }
}