class Solution {
    public int percentageLetter(String s, char letter) {
        float count = 0;
        for (char ch : s.toCharArray())
            if (ch == letter)
                count++;
        return (int) ((100 * count) / s.length());
    }
}