class Solution {
    public int prefixCount(String[] words, String pref) {
        int len  = pref.length();
        int count = 0;
        for(String word : words){
            int i = 0;
            while(i!=word.length() && i!=pref.length() && word.charAt(i)==pref.charAt(i))
                i++;
            if(i==pref.length())
                count++;
        }
        return count;
    }
}