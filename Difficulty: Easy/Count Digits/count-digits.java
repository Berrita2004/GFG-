class Solution {
    public int countDigits(int x) {
        // code here
            int count = 0 ;
        while ( x > 0 ){
            long last = x%10 ; 
            count = count +1;
            x = x /10;
        }
        return count ;
    }
}
