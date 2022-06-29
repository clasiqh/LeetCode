class Solution {
    public int minIncrementForUnique(int[] nums) {
        int res = 0;
        HashSet<Integer> x = new HashSet<>();
        for (int i = 1; i < nums.length; i++) {
            while (x.contains(nums[i])) {
                nums[i]++;
                res++;
            }
            x.add(nums[i]);
        }
        return res;
    }
}