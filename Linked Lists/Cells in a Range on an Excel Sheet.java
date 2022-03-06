class Solution {
    public List<String> cellsInRange(String s) {
        List<String> res = new ArrayList<>();
        char a = s.charAt(0), b = s.charAt(3);
        int x = s.charAt(1) - '0', y = s.charAt(4) - '0';

        while (a <= b) {
            for (int i = x; i <= y; i++)
                res.add(a + "" + i);
            a++;
        }
        return res;
    }
}