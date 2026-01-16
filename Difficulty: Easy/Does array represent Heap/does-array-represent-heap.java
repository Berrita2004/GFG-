class Solution {

    public boolean countSub(long arr[], long n) {
        int N = (int)n;

        for(int i = 0; i <= N/2 - 1; i++) {
            int left = 2*i + 1;
            int right = 2*i + 2;

            // Check left child
            if(left < N && arr[i] < arr[left]) {
                return false;  // violates max-heap
            }

            // Check right child
            if(right < N && arr[i] < arr[right]) {
                return false;  // violates max-heap
            }
        }

        return true; // All nodes satisfy max-heap property
    }
}
