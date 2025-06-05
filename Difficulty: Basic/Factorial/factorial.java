class Solution {
    static int factorial(int n) {
        // code here
        int fact = 1 ;
        for ( int i = 1 ; i <= n ; i ++){
          fact = i * fact ; 
    
}
        return fact;
    }
}