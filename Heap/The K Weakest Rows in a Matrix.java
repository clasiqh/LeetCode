class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        PriorityQueue<int[]> x = new PriorityQueue<>((a, b) -> a[1] == b[1] ? a[0] - b[0] : a[1] - b[1]);
        int[] res = new int[k];

        for (int i = 0; i < mat.length; i++) {
            int count = 0, j = 0;
            while (j != mat[0].length && mat[i][j++] != 0)
                count++;
            x.add(new int[] { i, count });
        }

        int idx = 0;
        while (idx != k)
            res[idx++] = x.poll()[0];
        return res;
    }
}