/* Link list Node
class Node
{
    Node next;
    int data;
    Node(int d)
    {
        data = d;
        next = null;
    }
}*/
class Solution {
    /*You are required to complete this method*/
    Node deleteK(Node head, int k) {
        // Your code here
        if (head == null || k==1) return null ;
     
        int cnt = 0 ;
        Node temp = head;
        Node prev = null; //NullPointerException
        while ( temp != null){
            cnt++ ;
            if ( cnt % k==0 ){
                prev.next = temp.next;
            }
            prev = temp ;
            temp = temp.next ; 
        }
        return head ; 
    }
}