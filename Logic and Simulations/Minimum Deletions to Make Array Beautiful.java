class Solution {
    public int minDeletion(int[] nums) {
        int count = 0, i = 0;
        while (i < nums.length) {
            if (i != nums.length - 1 && nums[i] == nums[i + 1]) {
                count++;
                i++;
                continue;
            }
            i += 2;
        }

        if ((nums.length - count) % 2 != 0)
            count++;

        return count;
    }
}