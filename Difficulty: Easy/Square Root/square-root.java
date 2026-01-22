class Solution {
    int floorSqrt(int n) {
        // Base cases: the square root of 0 is 0, and 1 is 1
        if (n == 0 || n == 1) return n;

        long low = 1, high = n, ans = 0;

        while (low <= high) {
            // Find midpoint; using this formula prevents potential integer overflow
            long mid = low + (high - low) / 2;

            // Check if mid squared is equal to n
            if (mid * mid == n) {
                return (int) mid;
            }

            // If mid*mid is less than n, mid could be the floor value
            if (mid * mid < n) {
                ans = mid;      // Store current mid as potential floor
                low = mid + 1;  // Look for a larger value in the right half
            } else {
                // If mid*mid is greater than n, the root must be in the left half
                high = mid - 1;
            }
        }
        return (int) ans;
    }
}
