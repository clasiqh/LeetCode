class Solution {
    public int findJudge(int n, int[][] trust) {
        if (n == 1)
            return trust.length == 0 ? 1 : -1;
        int[] arr = new int[n + 1];
        for (int[] curr : trust) {
            arr[curr[0]]--;
            arr[curr[1]]++;
        }
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == n - 1)
                return i;
        return -1;
    }
}