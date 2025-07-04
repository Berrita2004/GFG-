// User function Template for Java

class Solution {
    public int nthFibonacci(int n) {
        // code here\
         if (n == 0) return 0;
         if (n == 1) return 1;
        if (n == 2) return 1;
        int a = 1 ;
        int b = 1 ;
        int fib = 1 ;
for ( int i = 2 ; i < n ; i ++){
    fib = a + b ;
    a= b ;
    b = fib ;
}
return fib ;
    }
}