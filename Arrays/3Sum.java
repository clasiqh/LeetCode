class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
        
        for(int i=0; i<nums.length-2; i++){
            if(nums[i]>0) break;
            if(i!=0 && nums[i] == nums[i-1]) continue;
            int left = i+1, right = nums.length-1;
            while(left<right){
                int curr = nums[i]+nums[left]+nums[right];
                if(curr==0){
                    res.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(left<right && nums[left+1]==nums[left]) left++;
                    while(right>left && nums[right-1]==nums[right]) right--;
                    left++;
                    right--;
                }
                else if(curr<0) left++;
                else right--;
            }
        }
        
        return res;
    }
}