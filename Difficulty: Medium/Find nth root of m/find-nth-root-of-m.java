class Solution {
    public int nthRoot(int n, int m) {
        // recode
        // code here
        int low = 1 ; 
        int high = m ; 
        while ( low <= high){
            int mid = (low+high)/2;
            int power = powerOfExp( mid , n ,  m);
            
            if ( power == 1 ) return mid;
            else if( power == 0 ){
                low= mid+1;
            } 
            else {
                high = mid-1;
            }
            
        }
        return -1 ;
    }
    public static int powerOfExp(int mid,int n , int m ){
        long result = 1; 
        for ( int i = 0 ; i < n; i ++){
            result *= mid;
            if (result > m) return 2; 
        }
        if ( result == m) return 1;
        return 0 ;
    }
}