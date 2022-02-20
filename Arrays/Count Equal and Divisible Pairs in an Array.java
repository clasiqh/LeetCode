class Solution {
    public int countPairs(int[] nums, int k) {
        int count = 0;
        HashMap<Integer,List<Integer>> x = new HashMap<>();
        
        for(int i=0;i<nums.length;i++){
            if(!x.containsKey(nums[i]))
                x.put(nums[i], new ArrayList<>());
            else
                for(int o : x.get(nums[i]))
                    if((o*i)%k==0)
                        count++;
            x.get(nums[i]).add(i);
        }
        return count;
    }
}