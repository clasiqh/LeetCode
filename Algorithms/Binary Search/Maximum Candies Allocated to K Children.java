class Solution {
    public int maximumCandies(int[] candies, long k) {
        int right = Integer.MIN_VALUE, left = 1, ans = 0;
        for (int x : candies)
            right = Math.max(x, right);

        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (check(candies, k, mid)) {
                ans = mid;
                left = mid + 1;
            } else
                right = mid - 1;
        }
        return ans;
    }

    boolean check(int[] candies, long k, int num) {
        for (int candy : candies)
            k -= candy / num;
        return k <= 0;
    }
}