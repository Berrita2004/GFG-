/*
class Node {
    int data;
    Node left,right;
    Node(int d){
        data=d;
        left=right=null;
    }
}
*/

class Solution {
    int countNode(Node root){
        
        if ( root == null) return 0 ;
        return 1+ countNode(root.left) + countNode(root.right);
    }
    boolean isCBT(Node root , int idx , int totalNodes){
        if (root == null) return true;
        if ( idx >= totalNodes) return false;
        
        return isCBT(root.left, 2*idx+1, totalNodes) && isCBT(root.right, 2*idx+2, totalNodes);
        
    }
    boolean isMaxOrder(Node root){
        if (root.left == null && root.right == null) return true;
        
        if (root.right== null) return root.data >= root.left.data && isMaxOrder(root.left);
        
        return root.data >= root.left.data && root.data >= root.right.data && isMaxOrder(root.left)&& isMaxOrder(root.right);
    }
    public boolean isHeap(Node root) {
        // code here
        int totalNodes = countNode(root);
        return isCBT(root, 0 , totalNodes) && isMaxOrder(root);
    }
}