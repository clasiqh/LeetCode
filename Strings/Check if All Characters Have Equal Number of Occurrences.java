class Solution {
    public boolean areOccurrencesEqual(String s) {

        int[] arr = new int[26];
        //s.chars().forEach(i->arr[i-'a']++);
        for(char ch : s.toCharArray())
            arr[ch-'a']++;

        int check = 0;
        for(int i=0;i<26;i++){
            if(arr[i]==0)
                continue;
            if(check==0)
                check = arr[i];
            if(arr[i]!=check)
                return false;
        }

        return true;
    }
}