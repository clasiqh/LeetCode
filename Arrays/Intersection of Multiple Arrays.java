class Solution {
    public List<Integer> intersection(int[][] nums) {
        int[] arr = new int[1001];
        for(int[] num : nums)
            for(int x : num)
                arr[x]++;
        List<Integer> res = new ArrayList<>();
        for(int i=0; i<arr.length; i++)
            if(arr[i] == nums.length)
                res.add(i);
        return res;
    }
}