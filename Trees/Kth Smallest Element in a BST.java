class Solution {
    int ans = 0, count = 0;
    public int kthSmallest(TreeNode root, int k) {
        if(count==k || root==null)
            return ans;
        kthSmallest(root.left, k);
        count++;
        if(count==k)
            ans = root.val;
        kthSmallest(root.right, k);
        return ans;
    }
}