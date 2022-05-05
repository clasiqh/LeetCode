class Solution {
    public int countPrefixes(String[] words, String s) {
        int count = 0;
        for(String word : words){
            int i=0;
            if(word.length()>s.length())
                continue;
            while(i<word.length() && word.charAt(i)==s.charAt(i))
                i++;
            if(i==word.length())
                count++;
        }
        return count;
    }
}