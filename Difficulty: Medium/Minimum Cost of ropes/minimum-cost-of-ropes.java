class Solution {
    public static int minCost(int[] arr) {
        // code here
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        int n = arr.length;
        int ans = 0 ;
        int sum = 0;
        for (int i = 0 ; i < n ;i++){
            pq.add(arr[i]);
        }
        
        while (pq.size()>1){
            int a = pq.peek();
            pq.poll();
            int b = pq.peek();
            pq.poll();
            sum = a+b ;
            ans += sum;
            pq.add(sum);
        }
        return ans;
    }
}