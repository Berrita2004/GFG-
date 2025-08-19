class Solution {
    public int minTime(int[] arr, int k) {
        // code here
        int n = arr.length ;
        if (n<k) return -1 ;
        int low = Integer.MIN_VALUE ; 
        int high = 0 ;
        for ( int i = 0 ; i<n; i++){
            low = Math.max(low , arr[i]);
            high += arr[i];
        }
        
        while ( low <= high ){
            int mid = ( low + high)/2;
            int painter = findPainter(arr, mid );
            if (painter > k){
                low = mid +1;
            }
            else {
                high = mid-1 ;
            }
        }
        return low ;
    }
    public static int findPainter(int[] arr, int mid ){
        int sum = 0 ; 
        int p = 1 ; 
        for ( int i = 0 ; i< arr.length ; i++){
            if (sum+arr[i]<=mid){
                sum+=arr[i];
            }
            else{
                p++;
                sum= arr[i];
            }
        }
        return p ; 
    }
}
