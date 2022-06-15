class Solution {
    public int[] successfulPairs(int[] spells, int[] potions, long success) {
        
        Arrays.sort(potions);
        
        for(int i=0; i<spells.length; i++){
            int left = 0, right = potions.length-1, mid = 0;
            while(left<=right){
                mid = left + (right-left)/2;
                double val = spells[i]*(potions[mid]*1.0);
                if(success<=val)
                    right = mid;
                else
                    left = mid+1;
            }
            
            spells[i] = potions.length - left;
        }
        
        return spells;
    }
}