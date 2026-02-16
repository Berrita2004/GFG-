// User function Template for Java

class Solution {
    static int solve(int bt[]) {
        // code here
        int wt = 0 ;
        int n = bt.length;
        int cum =0 ; 
        Arrays.sort(bt);
        for (int i = 0 ; i <n ; i++){
            wt+= cum;
            cum += bt[i];
        }
        int res = wt/n;
        return res;
    }
}
