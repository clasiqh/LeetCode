class Solution {
    public Node copyRandomList(Node head) {
        
        HashMap<Node, Node> map = new HashMap<>();
        Node temp = head;
        while(temp!=null){
            map.put(temp, new Node(temp.val));
            temp = temp.next;
        }
        
        temp = head;
        while(temp!=null){
            Node curr = map.get(temp);
            curr.next = map.get(temp.next);
            curr.random = map.get(temp.random);
            temp = temp.next;
        }
        
        return map.get(head);
    }
}