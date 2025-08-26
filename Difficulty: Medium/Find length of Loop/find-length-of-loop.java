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
    public int lengthOfLoop(Node head) {
        // code here
        if (head == null) return 0;
        Node fast = head ;
        Node slow = head ;
        while( fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast == slow){
                int cnt =1;
                Node temp = fast.next;
                while (temp != slow){
                    cnt++;
                    temp = temp.next ;
                }
                return cnt;
       
            }
            
        }
        
        return 0 ;
    }
}