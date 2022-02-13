class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
        helper(nums, 0, new ArrayList<>());
        return res;
    }
    
    void helper(int[] nums, int index, List<Integer> temp){
        res.add(new ArrayList<>(temp));
        if(index==nums.length)
            return;
        for(int i=index;i<nums.length;i++){
            temp.add(nums[i]);
            helper(nums, i+1, temp);
            temp.remove(temp.size()-1);
        }   
    }
}