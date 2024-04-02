import java.util.ArrayDeque;
import java.util.Deque;

class Solution {
    public int pairSum(ListNode head) {
        Deque<Integer> deque = new ArrayDeque<>();
        ListNode p = head;
        int r = 0;
        while (p != null) {
            deque.addLast(p.val);
            p = p.next;
        }
        while (!deque.isEmpty()) {
            int s = deque.removeFirst() + deque.removeLast();
            if(s > r) r = s;
        }
        return r;
    }

    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next; }
    }
}

