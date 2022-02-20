// PRE : Root-L-R
class Solution {
    int i = 0;
    public TreeNode bstFromPreorder(int[] A) {
        return bstFromPreorder(A, Integer.MAX_VALUE);
    }

    public TreeNode bstFromPreorder(int[] A, int bound) {
        if (i == A.length || A[i] > bound) return null;
        return new TreeNode(A[i], bstFromPreorder(A, A[i++]), bstFromPreorder(A, bound));
    }
}