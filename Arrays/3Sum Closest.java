class Solution {
    public int threeSumClosest(int[] nums, int target) {
        int res = nums[0] + nums[1] + nums[2];
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 2; i++) {
            int start = i + 1, end = nums.length - 1;
            while (start < end) {
                int curr = nums[i] + nums[start] + nums[end];
                if (curr > target)
                    end--;
                else if (curr < target)
                    start++;
                else
                    return target;

                if (Math.abs(curr - target) < Math.abs(res - target))
                    res = curr;
            }
        }

        return res;
    }
}