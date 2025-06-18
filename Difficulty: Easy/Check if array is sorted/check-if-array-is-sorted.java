class Solution {
    public boolean arraySortedOrNot(int[] arr) {
        // code here
        int n = arr.length;
        for (int i = 1 ; i < n ; i ++){
            if( arr[i]< arr[i-1]){
                return false;
            }
          
        }
          return true ;
    }
}