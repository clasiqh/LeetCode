class Solution {
    public List<Integer> findKDistantIndices(int[] nums, int key, int k) {
        List<Integer> x = new ArrayList<>();
        List<Integer> res = new ArrayList<>();
        
        for(int i=0; i<nums.length; i++)
            if(nums[i]==key)
                x.add(i);
        
        for (int i=0; i<nums.length; i++)
            for(int j : x)
                if(Math.abs(i-j)<=k){
                    res.add(i);
                    break;
                }
                    
        return res;
    }
}