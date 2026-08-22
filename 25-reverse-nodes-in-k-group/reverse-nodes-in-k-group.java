class Solution {

    public ListNode reverseKGroup(ListNode head, int k) {

        // Dummy node
        ListNode dummy = new ListNode(0);
        dummy.next = head;

        // Node before the current group
        ListNode groupPrev = dummy;

        while (true) {

            // 1. Find kth node
            ListNode kth = groupPrev;

            for (int i = 0; i < k; i++) {
                kth = kth.next;

                // Fewer than k nodes remaining
                if (kth == null) {
                    return dummy.next;
                }
            }

            // Node after the current group
            ListNode groupNext = kth.next;

            // 2. Reverse the group
            ListNode prev = groupNext;
            ListNode curr = groupPrev.next;

            while (curr != groupNext) {

                ListNode next = curr.next;

                curr.next = prev;

                prev = curr;
                curr = next;
            }

            // Save the first node of the old group
            // It becomes the last node after reversal
            ListNode oldStart = groupPrev.next;

            // 3. Connect previous part to reversed group
            groupPrev.next = kth;

            // Move to the next group
            groupPrev = oldStart;
        }
    }
}