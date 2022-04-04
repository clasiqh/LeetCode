class Solution {
    public ListNode swapNodes(ListNode head, int k) {
         int len = 0;
        ListNode a = head;
        for(ListNode x = head; x!=null; x=x.next){
            len++;
            if(len==k) a = x;
        }
        
        int n = 0;
        for(ListNode x = head; x!=null; x = x.next){
            n++;
            if(n==len-k+1){
                int temp = a.val;
                a.val = x.val;
                x.val = temp;
                break;
            }
        }
        
        return head;
    }
}