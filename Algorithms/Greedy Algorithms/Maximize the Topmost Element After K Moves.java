class Solution {
    public static int maximumTop(int[] nums, int k) {
        if (nums.length == 1 && k % 2 == 1)
            return -1;

        int max = 0, min = Math.min(k - 1, nums.length);
        for (int i = 0; i < min; i++)
            max = Math.max(max, nums[i]);

        if (k < nums.length)
            max = Math.max(max, nums[k]);
        return max;
    }
}