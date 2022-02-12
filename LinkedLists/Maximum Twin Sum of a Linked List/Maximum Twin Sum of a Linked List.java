class Solution {
    public int pairSum(ListNode head) {
        ListNode slow = head, fast = head;
        Deque<Integer> x = new ArrayDeque<>();
        
        while(slow!=null){
            if(fast==null)
                x.addLast(slow.val);
            slow = slow.next;
            if(fast!=null)
                fast = fast.next.next;
        }
        
        int max = Integer.MIN_VALUE;
        slow = head;
        while(!x.isEmpty()){
            max = Math.max(max,x.pollLast()+slow.val);
            slow = slow.next;
        }
        return max;
    }
}