class Solution {
    public boolean isMonotonic(int[] nums) {
        int i = 1;
        while (i < nums.length && nums[i - 1] == nums[i])
            i++;
        if (i == nums.length)
            return true;
        boolean inc = nums[i] > nums[i - 1] ? true : false;
        while (i < nums.length) {
            if ((nums[i] < nums[i - 1] && inc) || (!inc && nums[i] > nums[i - 1]))
                return false;
            i++;
        }
        return true;
    }
}