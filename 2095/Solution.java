class Solution {
    public ListNode deleteMiddle(ListNode head) {
        if(head.next == null) return null;
        ListNode s = head;
        ListNode f = head.next.next;
        while(f != null && f.next != null){
            s = s.next;
            f = f.next.next;
        }
        s.next = s.next == null ? null : s.next.next;
        return head;
    }
}
