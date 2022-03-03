class Solution {
    public int numberOfArithmeticSlices(int[] nums) {
        if (nums.length < 3)
            return 0;
        int n = 1, ans = 0;
        int diff = nums[1] - nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (nums[i] - nums[i - 1] == diff) {
                n++;
                continue;
            }
            if (n > 2)
                ans += ((n - 2) * (n - 1)) / 2;

            diff = nums[i] - nums[i - 1];
            n = 2;
        }

        if (n > 2)
            ans += ((n - 2) * (n - 1)) / 2;
        return ans;
    }
}