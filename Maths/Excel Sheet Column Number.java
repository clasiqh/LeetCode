class Solution {
    public int titleToNumber(String str) {
        int sum=0, x=str.length()-1;
        for(char ch:str.toCharArray())
            sum += (ch-'A'+1) * Math.pow(26, x--);
        return sum;
    }
}