class Solution {
    
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> permuteUnique(int[] nums) {
        Arrays.sort(nums);
        helper(nums, new ArrayList<>(), new HashSet<>());
        return res;
    }
    
    void helper(int[] nums, List<Integer> temp, HashSet<Integer> x){
        if(x.size()==nums.length){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int i = 0; i<nums.length; i++){
            if(x.contains(i) || (i!=0 && nums[i]==nums[i-1] && !x.contains(i-1)))
                continue;
            x.add(i);
            temp.add(nums[i]);
            helper(nums, temp, x);
            temp.remove(temp.size()-1);
            x.remove(i);
        }
    }
}