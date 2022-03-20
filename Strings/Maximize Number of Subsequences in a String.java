class Solution {
    public long maximumSubsequenceCount(String text, String pattern) {
        int a = 0, b = 0;
        long total = 0;
        for (char ch : text.toCharArray()) {
            if (ch == pattern.charAt(1)) {
                total += a;
                b++;
            }
            if (ch == pattern.charAt(0))
                a++;
        }
        return total + Math.max(b, a);
    }
}