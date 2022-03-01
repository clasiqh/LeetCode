class Solution {
    public int[] countBits(int n) {
        int[] res = new int[n + 1];
        int next = 1, offset = 0;
        for (int i = 1; i <= n; i++) {
            if (i == next) {
                offset = next;
                next = next << 1;
            }
            res[i] = 1 + res[i - offset];
        }
        return res;
    }
}