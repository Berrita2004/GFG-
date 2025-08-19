class Solution {
    public int findPages(int[] arr, int k) {
        // code here
        
        int n = arr.length;
        if ( n<k) return -1 ;
        int low = Integer.MIN_VALUE ;
        int high = 0 ; 
        for ( int i = 0 ; i < n ; i ++){
            low = Math.max(low , arr[i]);
            high += arr[i];
        }
        while ( low <= high){
            int mid = ( low + high)/2 ;
            int all = allocate(arr, mid);
            if ( all > k){
                low = mid + 1 ;
            }
            else {
                high = mid -1 ;
            }
        }
        return low ;
    }
    public static int allocate ( int [] arr , int m){
        int pages = 0 ; 
        int stud = 1 ;
        for ( int i = 0 ; i < arr.length ; i ++){
            if ((pages + arr[i])<= m){
                pages += arr[i];
            }
            else {
                stud++;
                pages= arr[i];
            }
        }
        return stud ;
    }
    
}