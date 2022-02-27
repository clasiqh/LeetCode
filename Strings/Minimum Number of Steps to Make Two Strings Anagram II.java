class Solution {
    public int minSteps(String s, String t) {
        int[] arr = new int[26];
        for(char ch : s.toCharArray()) arr[ch-'a']++;
        for(char ch : t.toCharArray()) arr[ch-'a']--;
        
        int ans = 0;
        for(int x : arr) ans+= Math.abs(x);
        return ans;
    }
}