    import java.util.*;

class Solution {
    public double fractionalKnapsack(int[] val, int[] wt, int capacity) {
        
        int n = val.length;
        
        // Create index array
        Integer[] idx = new Integer[n];
        for (int i = 0; i < n; i++) {
            idx[i] = i;
        }
        
        // Sort indices by value/weight ratio (descending)
        Arrays.sort(idx, (a, b) -> 
            Double.compare(
                (double) val[b] / wt[b],
                (double) val[a] / wt[a]
            )
        );
        
        double totalValue = 0.0;
        int remaining = capacity;
        
        for (int i = 0; i < n && remaining > 0; i++) {
            
            int index = idx[i];
            
            if (wt[index] <= remaining) {
                // take full item
                totalValue += val[index];
                remaining -= wt[index];
            } else {
                // take fractional part
                totalValue += (double) val[index] * remaining / wt[index];
                break;  // knapsack full
            }
        }
        
        return totalValue;
    }
}
