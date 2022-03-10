class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        List<Integer> res = new ArrayList<>();
        boolean [] arr = new boolean[n];
        for(List<Integer> curr : edges)
            arr[curr.get(1)] = true;
        
        for(int i=0; i<n; i++)
            if(arr[i]==false)
                res.add(i);
        
        return res;
    }
}