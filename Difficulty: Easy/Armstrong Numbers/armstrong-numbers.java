// User function Template for Java
class Solution {
    static boolean armstrongNumber(int n) {
        // code here\
        int og = n ; 
        int exp = 0 ;
        int sum = 0 ;
       while ( n >  0){
           int last = n %10 ; 
            n = n /10 ; 
           sum = sum + (last * last * last ) ;
       }
        if ( sum == og ){
            return true ; 
        }
        else {
            return false ;
        }
    }
}