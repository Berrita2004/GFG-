// User function Template for Java

class Solution {
    static String isKSortedArray(int arr[], int n, int k) {
        // code here
        int [] sorted = arr.clone();
        Arrays.sort(sorted);
        HashMap<Integer,Integer> map = new HashMap<>();
        for ( int i = 0 ; i < n; i++){
            map.put(arr[i], i);
        }
        for ( int i = 0 ; i < n ; i++){
            int val = sorted[i];
            int idx = map.get(val);
            if(Math.abs(idx-i)>k) return "No";
        }
        return "Yes";
    }
}