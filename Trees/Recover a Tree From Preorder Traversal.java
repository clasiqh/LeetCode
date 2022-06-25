class Solution {

    int i = 0, req = 0;
    public TreeNode recoverFromPreorder(String traversal) {
        return make(traversal.toCharArray(), 0);
    }

    TreeNode make(char[] trav, int level) {
        int num = 0;
        while (i != trav.length && trav[i] != '-')
            num = num * 10 + Character.getNumericValue(trav[i++]);
        TreeNode curr = new TreeNode(num);

        if (i == trav.length)
            return curr;
        req = 0;
        while (trav[i] == '-') {
            req++;
            i++;
        }

        if (req > level) {
            curr.left = make(trav, level + 1);
            if (i != trav.length && req > level)
                curr.right = make(trav, level + 1);
        }
        return curr;
    }
}