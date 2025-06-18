class Solution {
    public int getSecondLargest(int[] arr) {
        // code here
        int lar = Integer.MIN_VALUE ;
        int seclar = Integer.MIN_VALUE ; 
        int n = arr.length;
        if (n < 2){
            return -1;
        }
      
        
        for (int i = 0 ; i < n ; i++){
            if (arr[i]>lar){
                seclar = lar ;
                lar = arr[i];
            }
            else if (arr[i]> seclar && arr[i]!= lar){
                seclar = arr[i];
            }
        }
        if (seclar == Integer.MIN_VALUE) return -1;
        return seclar;
    }
}