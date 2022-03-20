class Solution {
    public int countHillValley(int[] nums) {
        int count = 0, pre = 0;
        for(int i=2; i<nums.length;i++){
            while(i!=nums.length && nums[i-1]==nums[i]) i++;
            if(i==nums.length) break;
            if((nums[i-1]<nums[i]&&nums[i-1]<nums[pre]) || (nums[i-1]>nums[i]&&nums[i-1]>nums[pre])){
                count = count+1;
            }
            pre = i-1;
        }
        return count;
    }
}