class Solution {
    public long subarrayXor(int arr[], int k) {
        // code here
        int n = arr.length ;
        int count = 0 ;
        int xr = 0 ; 
        HashMap <Integer,Integer > mpp = new HashMap<>();
        mpp.put(0,1); // we start from 0 ;
        for (int i = 0 ; i < n ; i ++){
            // x = xr ^ k;
             xr ^= arr[i];
            int x = xr ^ k ;
            if (mpp.containsKey(x)){
                // if mpp does not has x, then put it in mpp and , 
                //if it does contain then +1 the index 
                // also count increase 
                count += mpp.get(x);
               
            }
              mpp.put(xr,mpp.getOrDefault(xr, 0) + 1);
        }
        return count ; 
    }
}