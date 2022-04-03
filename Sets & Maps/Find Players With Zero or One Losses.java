class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Set<Integer>[] x = new Set[3];
        for (int i = 0; i < 3; i++)
            x[i] = new TreeSet<>();

        for (int[] m : matches) {
            x[0].add(m[0]);
            if (!x[1].contains(m[1]))
                x[2].add(m[1]);
            else if (x[2].contains(m[1]))
                x[2].remove(m[1]);
            x[1].add(m[1]);
        }

        x[0].removeAll(x[1]);
        
        List<List<Integer>> res = new ArrayList<>();
        res.add(new ArrayList<>());
        res.add(new ArrayList<>());
        for (int num : x[0])
            res.get(0).add(num);
        for (int num : x[2])
            res.get(1).add(num);
        return res;
    }
}