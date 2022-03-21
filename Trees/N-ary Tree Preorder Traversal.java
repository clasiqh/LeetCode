class Solution {

    List<Integer> res = new ArrayList<>();

    public List<Integer> preorder(Node root) {
        helper(root);
        return res;
    }

    void helper(Node root) {
        if (root == null)
            return;
        res.add(root.val);
        for (Node x : root.children)
            helper(x);
    }

}