class Solution {
    public List<List<Integer>> findDifference(int[] nums1, int[] nums2) {
        List<List<Integer>> res = new ArrayList<>();
        HashSet<Integer> one = new HashSet<>();
        HashSet<Integer> two = new HashSet<>();

        res.add(new ArrayList<>());
        res.add(new ArrayList<>());

        for (int i : nums1)
            one.add(i);

        for (int i : nums2) {
            if (!one.contains(i) && !two.contains(i))
                res.get(1).add(i);
            two.add(i);
        }

        for (int i : one)
            if (!two.contains(i))
                res.get(0).add(i);

        return res;
    }
}