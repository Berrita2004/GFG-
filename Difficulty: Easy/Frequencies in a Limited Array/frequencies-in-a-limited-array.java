class Solution {
    // Function to count the frequency of all elements from 1 to N in the array.
    public List<Integer> frequencyCount(int[] arr) {
        // do modify in the given array
        int n = arr.length;
        int [] hash= new int [n+1];
        for ( int i = 0; i < n ; i ++){
            if(arr[i]>=1&& arr[i]<=n){
                //ye issilye kyuli hash value jo store karta hai woh 0-n kar raha hai 
                // if  i take n = 13 , hash ke pass 13 ki position hogi but hash ke pass 14 ki nahi hogi na 
        //kyuki 14 toh hash ke bhar chala gaya , hash har ek element ke liye ek value hi rakhta hai 
            hash[arr[i]]+= 1;
        }
        }
        List<Integer> result = new ArrayList<>();
        for ( int i = 1 ; i <= n ; i ++){
            result.add(hash[i]);
        }
        
        return result;
        
        
    }
}
