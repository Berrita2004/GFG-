/*

Definition for singly Link List Node
class Node
{
    int data;
    Node next,prev;

    Node(int x){
        data = x;
        next = null;
        prev = null;
    }
}

You can also use the following for printing the link list.
Node.printList(Node node);
*/

class Solution {
    public static ArrayList<ArrayList<Integer>> findPairsWithGivenSum(int target,
                                                                      Node head) {
        // code here
        Node left = head ;
        Node tail = head;
        while(tail.next!= null){
            tail = tail.next;
        }
        Node right = tail;
        
       ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
         while (left != null && right != null && left.data < right.data){
             int sum = (left.data + right.data);
             if(sum == target){
                ans.add(new ArrayList<>(Arrays.asList(left.data, right.data)));
                 left= left.next ;
                 right = right.prev;
             }
             else if (sum<target){
                 left = left.next;
             }
             else {
                 right = right.prev;
             }
         }
         return ans;
    }
}
