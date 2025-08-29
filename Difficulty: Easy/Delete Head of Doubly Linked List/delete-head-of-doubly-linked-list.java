// User function Template for Java

/*
class Node
{
    int data;
    Node next, prev;
    Node(int data)
    {
        this.data = data;
        this.next = this.prev = null;
    }
}
*/

// Complete the function
class Solution {
    public static Node deleteHead(Node head) {
        // your code here
        if(head == null) return null;
        if ( head.next == null) return null;
        Node newHead = head.next;
        newHead.prev = null;
        head.next = null;
        return newHead;
    }
}