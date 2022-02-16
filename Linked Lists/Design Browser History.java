class BrowserHistory {
    Node root;
    Node last;
    public BrowserHistory(String homepage) {
        root = new Node(homepage, null);
        last = root;
    }
    
    public void visit(String url) {
        last.next = new Node(url, last);
        last = last.next;
    }
    
    public String back(int steps) {
        while(last!=root&& steps!=0){
            last = last.prev;
            steps--;
        }
        return last.val;
    }
    
    public String forward(int steps) {
        while(last.next!=null && steps!=0){
            steps--;
            last = last.next;
        }
        return last.val;
    }
    
    class Node{
        Node next, prev;
        String val;
        Node(String str, Node prev) {
            this.val = str;
            this.prev = prev;
            this.next = null;
        }
    }
}