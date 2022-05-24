class Solution {
    public int maximumBags(int[] capacity, int[] rocks, int extra) {
        PriorityQueue<Integer> x = new PriorityQueue<>();
        for(int i=0; i<rocks.length; i++)
            if(capacity[i]-rocks[i]>0)
                x.add(capacity[i]-rocks[i]);
        
        int res = rocks.length-x.size();
        while(!x.isEmpty() && extra!=0){
            if(x.peek()>extra)
                return res;
            res++;
            extra -= x.poll();
        }

        return res;
    }
}