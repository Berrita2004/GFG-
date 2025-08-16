class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        Arrays.sort(stalls);
        int n = stalls.length;
        int low = 1 ;
        int high = stalls[n-1]- stalls[];
        while ( low <= high){
            int mid = (low + high)/2;
            if (canPlace(stalls, mid , k)==true){
                low = mid + 1 ;
            }
            else {
                high = mid - 1;
            }
        }
        return high ;
        
    }
    public static boolean canPlace (int[] stalls , int dist , int cows){
        int last = stalls[0];
        int n = stalls.length;
        int cnt = 1 ; 
        for (int i = 1 ; i < n ; i ++){
            if ((stalls[i]-last )>= dist) {
                cnt++;
                
                last = stalls[i];
                 if (cnt>= cows) return true ;
                
            }
            
        }
       
        return false ;
    }
}