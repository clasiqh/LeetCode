class Solution {
	public ListNode removeNthFromEnd(ListNode head, int n) {
		ListNode root = head, prev = head;
		int x = 0;
		while(root!=null){
			if(n<x++) prev = prev.next;
			root = root.next;
		}
		if(prev==head && x-n==0) return head.next;
		if(prev.next!=null)
			prev.next=prev.next.next;
		return head;
	}
}