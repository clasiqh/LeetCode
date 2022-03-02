class Solution {
    public boolean isSubsequence(String s, String t) {
        if(s.length()==0) return true;
        int i=0;
        for(char ch : t.toCharArray()){
            if(i<s.length() && ch==s.charAt(i)) i++;
            if(i==s.length()) return true;
        }
        return false;
    }
}