class Solution {
    public ListNode swapPairs(ListNode head) {
        
        if(head==null || head.next==null)
            return head;
        
        ListNode next = head.next;
        ListNode temp = new ListNode();
        temp.next = next;
        
        ListNode prev = new ListNode();
        
        while(head!=null && next!=null){
            
            ListNode front = next.next;
            head.next = front;
            next.next = head;
            prev.next = next;
            head = head.next;
            
            if(head==null)
                break;
            next = head.next;
            prev = prev.next.next;
        }
        
        return temp.next;
    }
}