class Solution {
    public int aggressiveCows(int[] stalls, int k) {
        // code here
        int n = stalls.length;
        Arrays.sort(stalls);
        int range = stalls[n-1]- stalls[0];
        for ( int i = 1 ; i <= range ; i++){
            if (canPlace(stalls, i, k) == false)  {   return i-1;}
        }
        return range ;
    }
    public static boolean canPlace(int[] stalls, int dist, int cows){
        int n = stalls.length;
        int last = stalls[0];
        int cntcow = 1 ;
        
        for ( int i = 1; i < n ; i++){
            if ((stalls[i]- last)>= dist) {
                cntcow++; 
            last = stalls[i];}
            if (cntcow >= cows) return true;
            
        }
        return false;
    }
    
}