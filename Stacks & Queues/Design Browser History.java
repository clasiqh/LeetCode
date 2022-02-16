
// STACK SOLUTION, try Doubly Linked List.
class BrowserHistory {
    Deque<String> x = new ArrayDeque<>();
    Deque<String> forward = new ArrayDeque<>();
    String homepage;

    public BrowserHistory(String homepage) {
        this.homepage = homepage;
    }
    
    public void visit(String url) {
        x.push(url);
        forward = new ArrayDeque<>();
    }
    
    public String back(int steps) {
        while(steps!=0 && !x.isEmpty()){
            steps--;
            forward.push(x.removeFirst());
        }
        
        return x.isEmpty()?homepage:x.peekFirst();
    }
    
    public String forward(int steps) {
        while(steps!=0 && !forward.isEmpty()){
            steps--;
            x.push(forward.removeFirst());
        }
        return x.isEmpty()?homepage:x.peekFirst();
    }
}