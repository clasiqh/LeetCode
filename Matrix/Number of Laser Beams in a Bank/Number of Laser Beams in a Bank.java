class Solution {
    public int numberOfBeams(String[] bank) {
        
        int ans = 0;
        int prev = 0;
        
        for(int i=0;i<bank.length;i++){
            int temp = countNum(bank[i]);
            if(temp!=0){
                ans += prev*temp;
                prev = temp;
            }
        }
        return ans;
    }
    
    //returns number of '1s' in the String
    int countNum(String row){
        int count = 0;
        for(char c : row.toCharArray())
            if(c=='1')
                count++;
        
        return count;
    }
}