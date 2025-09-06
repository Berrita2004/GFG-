class Solution {
    ArrayList<Integer> twoOddNum(int[] arr) {
        // code here
        int xor = 0 ;
        for ( int i = 0 ; i < arr.length; i++){
            xor = xor ^ arr[i];
        }
        int rightmost = xor & (-xor);
        int b1 =0; int b2= 0 ;
        for ( int i = 0 ; i< arr.length; i++){
            if((arr[i] & rightmost)!=0){
                b1 ^=arr[i];
            }
            else {
                b2^=arr[i];
            }
        }
          ArrayList<Integer> ans = new ArrayList<>();
        // return in decreasing order
        if (b1 > b2) {
            ans.add(b1);
            ans.add(b2);
        } else {
            ans.add(b2);
            ans.add(b1);
        }
        return ans;
    }
}
