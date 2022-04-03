class Solution {
    public int triangularSum(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            int last = nums[i];
            for (int j = i + 1; j < nums.length; j++) {
                int temp = (last + nums[j]) % 10;
                last = nums[j];
                nums[j] = temp;
            }
        }
        return nums[nums.length - 1];
    }
}