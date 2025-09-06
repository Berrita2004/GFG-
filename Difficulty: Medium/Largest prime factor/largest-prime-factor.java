// User function Template for Java

class Solution {
    static int largestPrimeFactor(int n) {
        int largest = -1;

        // Step 1: Remove factor 2
        while (n % 2 == 0) {
            largest = 2;
            n /= 2;
        }

        // Step 2: Check odd factors
        for (int i = 3; i * i <= n; i += 2) {
            while (n % i == 0) {
                largest = i;
                n /= i;
            }
        }

        // Step 3: If n > 2, it is prime
        if (n > 2) {
            largest = n;
        }

        return largest;
    }
}
