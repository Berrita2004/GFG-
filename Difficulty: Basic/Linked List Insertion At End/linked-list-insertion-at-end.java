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
    public Node insertAtEnd(Node head, int x) {
        // code here

Node N = new Node(x);
if ( head == null) return N;
 Node temp = head ;
 while(temp.next!= null){
     temp = temp.next;
 }
 temp.next = N;
 return head;
    }
}