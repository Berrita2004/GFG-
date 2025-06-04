// User function Template for Java

class Solution {
    public int reverseDigits(int x) {
        // Code here
           int reverse = 0 ;
    while ( x > 0) {
        int last = x % 10 ;
         reverse = reverse*10+last ;
         x = x/10;
    }      return reverse ;  
    }
}