// User function Template for Java
class Solution {
    public static double findSmallestMaxDist(int stations[], int k) {
        int n = stations.length;

        // Step 1: Find the largest gap between consecutive stations
        double high = 0;
        for (int i = 0; i < n - 1; i++) {
            high = Math.max(high, stations[i + 1] - stations[i]);
        }

        double low = 0;
        double eps = 1e-6;  // precision control

        // Step 2: Binary search on the answer
        while (high - low > eps) {
            double mid = (low + high) / 2.0;

            // Check how many extra stations are needed if max gap is <= mid
            int required = countStationsNeeded(stations, mid);

            if (required > k) {
                // too many stations needed -> distance too small
                low = mid;
            } else {
                // feasible -> try smaller distance
                high = mid;
            }
        }

        return high;
    }

    // Helper function: given max allowed gap (dist),
    // return how many new stations are needed
    private static int countStationsNeeded(int[] stations, double dist) {
        int count = 0;
        for (int i = 0; i < stations.length - 1; i++) {
            double gap = stations[i + 1] - stations[i];
            count += (int)(gap / dist);
        }
        return count;
    }
}
