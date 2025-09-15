
class Solution {
    public static int[] count_NGE(int arr[], int indices[]) {
        // code here
       
        int n = arr.length;
        int m= indices.length;
        int [] ans = new int [m];
        for ( int i = 0 ; i < m ; i++){
            int  idx = indices[i];
             int cnt = 0 ; 
             for ( int j = idx +1 ;j < n;j++){
            if (arr[j]> arr[idx]){
                cnt++;
            }  
            }
            ans[i]= cnt;
        }
        return ans;
    }
}
