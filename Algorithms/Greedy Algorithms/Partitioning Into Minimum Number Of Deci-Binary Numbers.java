class Solution {
    public int minPartitions(String n) {
        char ans = n.charAt(0);
        for (char ch : n.toCharArray())
            ans = (char) Math.max(ans, ch);
        return ans - '0';
    }
}