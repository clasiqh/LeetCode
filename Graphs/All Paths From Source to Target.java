class Solution {
    List<List<Integer>> res = new ArrayList<>();
    public List<List<Integer>> allPathsSourceTarget(int[][] graph){
        helper(0, new ArrayList<>(), graph);
        return res;
    }
    
    void helper(int index, List<Integer> temp, int[][] graph){
        temp.add(index);
        if(index==graph.length-1){
            res.add(new ArrayList<>(temp));
            return;
        }
        for(int node : graph[index]){
            helper(node, temp, graph);
            temp.remove(temp.size()-1);
        }
    }
}