class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        int count = 0;
        List<Integer> small = new ArrayList<>();
        List<Integer> big = new ArrayList<>();
        
        for(int num : nums){
            if(num<pivot)
                small.add(num);
            else if(num==pivot)
                count++;
            else
                big.add(num);
        }
        
        int i=0;
        for(int num : small)
            nums[i++] = num;
        while(count!=0){
            nums[i++] = pivot;
            count--;
        }
        for(int num : big)
            nums[i++] = num;
        
        return nums;
    }
}