class Solution {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int carry = 0, sum = 0;
        ListNode ans = new ListNode(), head;
        head = ans;
        while (l1 != null || l2 != null) {
            int x = l1 == null ? 0 : l1.val;
            int y = l2 == null ? 0 : l2.val;

            int total = x + y + carry;
            carry = total / 10;
            ans.next = new ListNode(total % 10);
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            ans = ans.next;
        }

        if (carry != 0)
            ans.next = new ListNode(carry);
        return head.next;
    }
}