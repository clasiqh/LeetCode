class Solution {
    public int countAsterisks(String s) {
        int count = 0, x = 0;

        for (char ch : s.toCharArray()) {
            if (ch == '|')
                x++;
            if (x % 2 == 0 && ch == '*')
                count++;
        }
        return count;
    }
}