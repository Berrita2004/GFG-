class Solution {
    public int nthRoot(int n, int m) {
        int low = 1, high = m;
        
        while (low <= high) {
            int mid = (low + high) / 2;
            long power = powerWithOverflow(mid, n, m);
            
            if (power == m) return mid;
            else if (power < m) low = mid + 1;
            else high = mid - 1;
        }
        
        return -1; // floor of the root
    }
    
    private long powerWithOverflow(int base, int exp, int limit) {
        long result = 1;
        for (int i = 0; i < exp; i++) {
            result *= base;
            if (result > limit) return result; // early exit to avoid overflow
        }
        return result;
    }
}
