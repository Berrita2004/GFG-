class Solution {
    public Node reverse(Node head) {
        if (head == null) return null;

        Node curr = head;
        Node temp = null;

        while (curr != null) {
            // swap prev and next
            temp = curr.prev;
            curr.prev = curr.next;
            curr.next = temp;

            // move to next node (which is prev after swap)
            head = curr;   // keep track of last processed node
            curr = curr.prev;
        }

        return head;
    }
}
