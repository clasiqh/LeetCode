class Solution {
    public int minStoneSum(int[] piles, int k) {
        
        PriorityQueue<Integer> x = new PriorityQueue<>((a,b)->b-a);
        int res = 0;
        for(int i:piles){
            x.add(i);
            res+=i;
        }
        
        while(k!=0){
            int num = x.poll();
            res = res- num/2;
            x.add(num - num/2);
            k--;
        }
        
        return res;
    }
}