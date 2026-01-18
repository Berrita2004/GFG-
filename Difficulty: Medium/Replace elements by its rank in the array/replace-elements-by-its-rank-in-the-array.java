// User function Template for Java

class Solution {
    static int[] replaceWithRank(int arr[], int N) {
        // code here
        //map lo
        HashMap <Integer, Integer> map = new HashMap<>();
        //sort karo arr
        int[] sorted = arr.clone();
        Arrays.sort(sorted);
        // definne ranks based from 1 
        int rank = 1 ;
        for (int i = 0 ; i< N; i++){
             if (i>0 && sorted[i]== sorted[i-1]){
                 continue;
             }
             
            map.put(sorted[i], rank++);
            
        }
        // add elemnet acc to rank  to the result 
        int [] res = new int[N];
        for ( int i = 0 ; i < N ; i++){
            res[i]= map.get(arr[i]);
        }
        
        return res;
        
        
    }
}
