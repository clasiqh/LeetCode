class Solution {
    HashSet<Integer> visited = new HashSet<>();
    public int findCircleNum(int[][] isConnected) {
        int count = 0;
        for(int i=0;i<isConnected.length;i++){
            if(!visited.contains(i)){
                count++;
                helper(isConnected, i);
            }
            else if(visited.size()==isConnected.length)
                break;
        }
        return count;
    }
    
    void helper(int[][] isConnected, int index){
        if(visited.contains(index)) return;
        visited.add(index);
        for(int i=0;i<isConnected.length;i++)
            if(isConnected[index][i]==1 && !visited.contains(i))
                helper(isConnected, i);
    }
}