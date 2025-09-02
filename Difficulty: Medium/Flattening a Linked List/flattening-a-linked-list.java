/*
class Node {
    int data;
    Node next;
    Node bottom;

    Node(int x) {
        data = x;
        next = null;
        bottom = null;
    }
}
*/
class Solution {
    public Node merge2list(Node list1, Node list2){
        Node dummyNode = new Node (-1);
        Node res = dummyNode;
        while(list1 != null && list2!= null){
            if(list1.data < list2.data){
                res.bottom = list1;
                res = list1;
                list1= list1.bottom;
            }
            else {
                res.bottom = list2;
                res = list2;
                list2= list2.bottom;
            }
             res.next = null;
        }
        if (list1 != null ) res.bottom = list1;
        else res.bottom = list2;
        return dummyNode.bottom;
    }
    
    
    public Node flatten(Node head) {
        // code here
        
        if ( head == null ||  head.next == null){
        return head;
        }
        Node mergeHead =flatten(head.next);
        head = merge2list(head, mergeHead);
        return head;
    }
}