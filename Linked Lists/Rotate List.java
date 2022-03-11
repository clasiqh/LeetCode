class Solution {
    public ListNode rotateRight(ListNode head, int k) {
        if(head==null||head.next==null)
            return head;
        int len = 0;
        ListNode fast = head, end = head;
        
        while(fast!=null && fast.next!=null){
            len++;
            fast = fast.next.next;
            end = fast==null? end.next : fast;
        }
        
        len = fast==null ? len*2 : len*2+1;
        fast = head;
        k = k%len;
        if(k==0) return head;
        for (int i=0; i!=len-k-1; i++)
            fast = fast.next;
        
        ListNode next = fast.next;
        fast.next = null;
        end.next = head;
        return next;
    }
}