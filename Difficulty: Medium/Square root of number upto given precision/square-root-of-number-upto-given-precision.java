    class Solution {
    public double squareRoot(int n, int p) {
        int low = 0;
        int high = n;
        int ans = -1;

        // Binary search for integer part
        while (low <= high) {
            int mid = (low + high) / 2;
            long sq = (long) mid * mid;

            if (sq == n) {
                return mid; // perfect square
            } else if (sq < n) {
                ans = mid;  // possible floor value
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }

        // Incremental search for decimal part
        double root = ans;
        double increment = 0.1;
        for (int i = 0; i < p; i++) {
            while ((root + increment) * (root + increment) <= n) {
                root += increment;
            }
            increment /= 10;
        }

        return root;
    }
}
