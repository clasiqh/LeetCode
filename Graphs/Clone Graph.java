class Solution {
    public Node cloneGraph(Node node) {
        if(node==null) return node;
        
        Map<Node, Node> x = new HashMap<>();
        Queue<Node> queue = new LinkedList<>();
        x.put(node, new Node(node.val));
        
        queue.add(node);
        while(!queue.isEmpty()){
            Node curr = queue.poll();
            for(Node n : curr.neighbors){
                if(!x.containsKey(n)){
                    x.put(n, new Node(n.val));
                    queue.add(n);
                }
                x.get(curr).neighbors.add(x.get(n));
            }
        }
        
        return x.get(node);
    }
}