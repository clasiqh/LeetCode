class Solution {
    public boolean isPalindrome(ListNode head) {
        if (head.next == null)
            return true;
        ListNode fast = head, slow = head, prev = head;

        // find middle
        while (fast != null && fast.next != null) {
            prev = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        prev.next = null;
        slow = fast == null ? slow : slow.next;

        // reverse second half
        prev = null;
        while (slow != null) {
            ListNode temp = slow.next;
            slow.next = prev;
            prev = slow;
            slow = temp;
        }

        // check if equal
        while (head != null && prev != null && head.val == prev.val) {
            head = head.next;
            prev = prev.next;
        }

        return head == null && prev == null;
    }
}