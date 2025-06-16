import java.util.HashMap;

class Solution {
    int findFrequency(int arr[], int x) {
        HashMap<Integer, Integer> freq = new HashMap<>();
        for (int num : arr) {
            freq.put(num, freq.getOrDefault(num, 0) + 1);
        }
        return freq.getOrDefault(x, 0);
    }
}