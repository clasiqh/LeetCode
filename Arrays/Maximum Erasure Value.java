class Solution {
    public int maximumUniqueSubarray(int[] nums) {
        int max = 0, sum = 0, start = 0;
        HashSet<Integer> x = new HashSet<>();

        for (int i = 0; i < nums.length; i++) {

            while (x.contains(nums[i])) {
                sum -= nums[start];
                x.remove(nums[start]);
                start++;
            }

            x.add(nums[i]);
            sum += nums[i];
            max = Math.max(max, sum);
        }

        return max;
    }
}