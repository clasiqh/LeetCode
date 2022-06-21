class Solution {
    public String greatestLetter(String s) {
        HashSet<Character> x = new HashSet<>();
        char temp = '>';
        for (char ch : s.toCharArray())
            x.add(ch);
        for (char i = 'A'; i <= 'Z'; i++)
            if (x.contains(i) && x.contains((char) (i + 32)))
                temp = i;
        return temp == '>' ? "" : temp + "";
    }
}