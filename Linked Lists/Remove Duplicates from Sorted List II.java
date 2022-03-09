class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        ListNode root = new ListNode(), temp;
        temp = root;
        
        while(head!=null){
            if(head.next!=null && head.val==head.next.val)
                while(head.next!=null && head.val==head.next.val)
                    head=head.next;
            else{
                temp.next = head;
                temp = temp.next;
            }
            head = head.next;
        }
        temp.next=null;
        return root.next;
    }
}