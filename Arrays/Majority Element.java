class Solution {
    public int majorityElement(int[] nums) {
        int count = 0, x = nums[0];
        for (int num : nums) {
            if (num == x)
                count++;
            else {
                count--;
                if (count == 0) {
                    x = num;
                    count++;
                }
            }
        }
        return x;
    }
}