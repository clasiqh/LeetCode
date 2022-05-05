class Solution {
    public int minimumAverageDifference(int[] nums) {
        int res = 0;
        long right = 0, left = 0, min = Long.MAX_VALUE;
        for (int num : nums)
            right += num;
        for (int i = 0; i < nums.length; i++) {
            left += nums[i];
            right -= nums[i];
            long curr = i == nums.length - 1 ? left / (i + 1)
                    : Math.abs(left / (i + 1) - right / (nums.length - (i + 1)));
            if (curr < min) {
                min = curr;
                res = i;
            }
        }
        return res;
    }
}