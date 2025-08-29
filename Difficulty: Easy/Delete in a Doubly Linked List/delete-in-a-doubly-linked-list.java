/*
Structure of a Doubly LinkList
class Node {
    int data;
    Node next;
    Node prev;

    Node(int val) {
        data = val;
        next = null;
        prev = null;
    }
}
*/
class Solution {
    public Node delPos(Node head, int x) {
        // code here
        if (head == null) return null;
        if (x==1) return delHead(head);
        
        
        int cnt = 1 ;
        Node temp = head ;
        
        while ( temp != null && cnt< x){
            cnt++  ;
            temp = temp.next ;
        }
        if (temp == null) return head;
        if(temp.next == null){
            return delTail(head);
        }
        
         Node back = temp.prev ;
        Node front = temp.next ;
      
        back.next = front ;
        front.prev = back;
        temp.prev = null;
        temp.next = null;
        return head;
    }
        
        public Node delHead(Node head){
            if (head == null) return null;
            if (head.next == null) return null;

            Node newHead = head.next;
            newHead.prev = null;
            head.next = null;
            return newHead;
        }
        public Node delTail(Node head){
            if (head == null) return null;
            if (head.next == null) return null;
            Node tail = head ;
            while(tail.next!= null){
                tail = tail.next ;
            }
            Node back = tail.prev;
            back.next = null;
            tail.prev = null;
            return head;
        }
        
       
        
    
}