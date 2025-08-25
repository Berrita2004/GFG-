/*
class Node {
    int data;
    Node next;

    Node(int x) {
        data = x;
        next = null;
    }
}
*/

class Solution {
    public Node insertAtFront(Node head, int x) {
        // code here
        if (head == null) return null;
        Node temp = new Node(x);
        temp.next = head;
        head = temp;
        return head ;
        
    }
}