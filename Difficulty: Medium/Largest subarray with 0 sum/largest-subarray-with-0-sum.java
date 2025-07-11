class Solution {
    int maxLength(int arr[]) {
        // code here
        int n = arr.length ; 
        int sum = 0 ;
        int max = 0 ;
        HashMap <Integer,Integer> mpp = new HashMap<>();
        for ( int i = 0 ; i < n ; i ++){
            sum += arr[i];
            if (sum == 0 ){
                max  = i +1;
                
            }
            else if (mpp.get(sum)!=null){
                max = Math.max(max, i - mpp.get(sum));
                
            }
            else {
                mpp.put(sum,i);
            }
        }
        return max;
    }
}