class Solution {
    public int mostFrequent(int[] nums, int key) {
        int[] arr = new int[1001]; // not the best way, time-saver for contest

        for (int i = 0; i < nums.length - 1; i++)
            if (nums[i] == key)
                arr[nums[i + 1]] = arr[nums[i + 1]] + 1;

        int max = 0;
        int maxVal = -1;

        for (int i = 1; i <= 1000; i++) {
            if (maxVal < arr[i]) {
                maxVal = arr[i];
                max = i;
            }
        }
        return max;
    }
}