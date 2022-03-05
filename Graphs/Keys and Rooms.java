class Solution {
    public boolean canVisitAllRooms(List<List<Integer>> rooms) {
        Set<Integer> x = new HashSet<>();
        Queue<Integer> queue = new LinkedList<>();
        queue.add(0);
        while(!queue.isEmpty()){
            int curr = queue.poll();
            x.add(curr);
            for(int i : rooms.get(curr))
                if(!x.contains(i))
                    queue.add(i);
        }
        return x.size() == rooms.size();
    }
}