// User function Template for Java

class Solution {
    public int findMinDiff(ArrayList<Integer> arr, int m) {
        // your code here
        int n = arr.size();
        int res = Integer.MAX_VALUE;
        Collections.sort(arr);
        for ( int i = 0 ; i< n-m+1; i++){
            int min = arr.get(i);
            int max = arr.get(i+m-1);
            res = Math.min(res,(max-min));
        }
        return res;
    }
}