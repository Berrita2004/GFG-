class Solution {
    public int kthSmallest(int[] arr, int k) {
        // Code here
        PriorityQueue <Integer> pq= new PriorityQueue<>(Collections.reverseOrder());
        int n = arr.length;
        for ( int i = 0 ; i < k ;i++){
            pq.add(arr[i]);
        }
        for ( int i = k ; i < n; i++ ){
            if (arr[i]< pq.peek()){
                pq.poll();
                pq.add(arr[i]);
            }
        }
        int ans = pq.peek();
        return ans ;
    }
}
