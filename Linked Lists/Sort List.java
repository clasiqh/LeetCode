class Solution {
    public ListNode sortList(ListNode head) {
        if(head==null || head.next==null)
            return head;
        ListNode prev = null, slow = head, fast = head;
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        return merge(sortList(head), sortList(slow));
    }
    
    ListNode merge(ListNode l1, ListNode l2){
        ListNode head = new ListNode();
        ListNode root = head;
        while(l1!=null && l2!=null) {
            if(l1.val<l2.val) {
                head.next = l1;
                l1 = l1.next;
            } else {
                head.next = l2;
                l2 = l2.next;
            }
            head = head.next;
        }
        
        if(l1!=null) head.next = l1;
        if(l2!=null) head.next = l2;
        return root.next;
    }
}