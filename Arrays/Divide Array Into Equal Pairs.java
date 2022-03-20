class Solution {
    public boolean divideArray(int[] nums) {
        int[] arr = new int[501];
        for(int x : nums)
            arr[x]++;
        
        for(int i=1; i<=500; i++)
            if(arr[i]%2!=0)
                return false;
        
        return true;
    }
}