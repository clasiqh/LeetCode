class Solution {
    public int numBusesToDestination(int[][] routes, int source, int target) {
        if(source==target) return 0;
        
        HashSet[] x = new HashSet[routes.length];
        List<List<Integer>> graph = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        HashSet<Integer> visited = new HashSet<>();
        
        for(int i=0; i<routes.length; i++){
            graph.add(new ArrayList<>());
            x[i] = new HashSet<Integer>();
            for(int num : routes[i])
                x[i].add(num);
            if(x[i].contains(source)){
                q.add(i);
                visited.add(i);
            }
        }
        
        for(int i=0; i<routes.length; i++)
            for(int j=i+1; j<routes.length; j++)
                if(intersect(x[i], x[j])){
                    graph.get(i).add(j);
                    graph.get(j).add(i);
                }

        int level = 0;
        while(!q.isEmpty()){
            level++;
            int size = q.size();
            for(int i=0; i<size; i++){
                int idx = q.poll();
                if(x[idx].contains(target))
                    return level;
                for(int node : graph.get(idx))
                    if(!visited.contains(node)){
                        q.add(node);
                        visited.add(node);
                    }
            }
        }
        return -1;
    }
    
        boolean intersect(HashSet<Integer> A, HashSet<Integer> B){
        for(int x : A)
            if(B.contains(x))
                return true;
        return false;
    }

}