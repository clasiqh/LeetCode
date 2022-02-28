class Solution {
    
    public List<String> summaryRanges(int[] nums){
        List<String> res = new ArrayList<>();
        if(nums.length==0) return res; 
        int num1 = nums[0], num2 = nums[0];
        
        for(int i=1; i<nums.length; i++){
            if(nums[i]==nums[i-1]+1){
                num2 = nums[i];
                continue;
            }
            check(num1, num2, res);
            num1 = nums[i];
            num2 = nums[i];
        }
        check(num1, num2, res);
        return res;
    }

    void check(int num1, int num2, List<String> res){
        if(num1==num2) res.add(num1+"");
        else res.add(num1+"->"+num2);
    }
}