class Solution {
    static Node deleteAllOccurOfX(Node head, int x) {
        if (head == null) return null;

        ArrayList<Node> nodes = new ArrayList<>();
        Node temp = head;

        // Step 1: Collect all nodes whose data != x
        while (temp != null) {
            if (temp.data != x) {
                nodes.add(temp);
            }
            temp = temp.next;
        }

        // Step 2: If all nodes were removed
        if (nodes.isEmpty()) return null;

        // Step 3: Re-link nodes from ArrayList
        Node newHead = nodes.get(0);
        newHead.prev = null;
        Node curr = newHead;

        for (int i = 1; i < nodes.size(); i++) {
            curr.next = nodes.get(i);
            nodes.get(i).prev = curr;
            curr = curr.next;
        }

        // Terminate the list
        curr.next = null;

        return newHead;
    }
}
