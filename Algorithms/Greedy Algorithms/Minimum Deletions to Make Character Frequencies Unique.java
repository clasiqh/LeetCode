class Solution {
    public int minDeletions(String s) {
        int[] freq = new int[26];
        for (char ch : s.toCharArray())
            freq[ch - 'a']++;

        Arrays.sort(freq);
        int max = Integer.MAX_VALUE, res = 0;
        for (int i = 25; i >= 0; i--) {
            if (freq[i] == 0)
                break;
            if (freq[i] > max) {
                res += freq[i] - max;
                freq[i] = max;
            }
            max = Math.max(0, freq[i] - 1);
        }
        return res;
    }
}