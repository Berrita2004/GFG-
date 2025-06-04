class Solution {
    public static int gcd(int n, int m) {
        // Base case: if one number is 0, the GCD is the other number
        if (m == 0) {
            return n;
        }
        // Recursive call
        return gcd(m, n % m);
    }
}