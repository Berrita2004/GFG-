/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

/*
class Node{
    int data;
    Node next;

    Node(int x){
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node addOne(Node head) {
        int carry = helper(head);

        // if carry still remains, add a new node at front
        if (carry == 1) {
            Node newNode = new Node(1);
            newNode.next = head;
            return newNode;
        }
        return head;
    }

    // recursive helper: adds 1 to the last node and propagates carry
    private int helper(Node node) {
        if (node == null) {
            return 1; // base case → we need to add 1
        }

        int carry = helper(node.next);
        int sum = node.data + carry;

        node.data = sum % 10;
        return sum / 10; // return carry
    }
}
