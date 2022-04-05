class Solution {
    public int maxArea(int[] height) {
        int l = 0, r = height.length - 1, max = 0;
        while (l < r) {
            int curr = (r - l) * Math.min(height[l], height[r]);
            max = Math.max(max, curr);
            int x = height[l] < height[r] ? l++ : r--;
        }
        return max;
    }
}