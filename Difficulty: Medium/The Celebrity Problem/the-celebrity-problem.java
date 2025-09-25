class Solution {
    public int celebrity(int mat[][]) {
        // code here
        int n = mat.length;
        int [] knowme = new int[n];
        int [] iknow = new int[n];
        for  (int i = 0 ; i <= n-1; i++){
            for ( int j = 0 ; j<= n-1;j++){
                if (i != j && mat[i][j]==1){
                knowme[j]++;
                iknow[i]++;
                }   
            }
        }
        for ( int i = 0 ; i <= n-1; i ++){
            if(knowme[i] == n-1 && iknow[i] == 0){
                return i ;
            }
        }
        return -1;
    }
}