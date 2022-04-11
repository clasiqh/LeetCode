class Solution {
    public int maximumProduct(int[] nums, int k) {
        double mod = 1000000007;
        if(nums.length==1) return (int)((nums[0]+k)%mod);
        PriorityQueue<Integer> x = new PriorityQueue<>();
        for(int num : nums)
            x.add(num);
        
        while(k!=0){
            int curr = x.poll(), next = x.peek();
            if(next-curr+1<=k){
                x.add(curr+next-curr+1);
                k = k-(next-curr+1);
            }
            else if(k<=next-curr){
                x.add(curr+k);
                k=k-k;
            }
        }
        double res = 1;
        while(!x.isEmpty())
            res = (res*x.poll())%mod;
        return (int)res;
    }
}