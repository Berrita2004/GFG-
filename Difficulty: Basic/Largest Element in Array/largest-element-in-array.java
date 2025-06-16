class Solution {
    public static int largest(int[] arr) {
        // code here
        int maxi=arr[0];
        int n = arr.length;
        for (int i = 0;i<= n-1 ; i ++){
       
            maxi = Math.max(maxi,arr[i]);
            
        }
        return maxi;
    }
}
