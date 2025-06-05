class Solution {
    public void reverseArray(int arr[]) {
        // code here
        int le= 0 ; 
        int ri = arr.length-1;
        int temp ;
        while (le< ri){
            temp = arr[le];
            arr[le] = arr[ri];
            arr[ri] = temp;
            le++;
            ri--;
        }   
    }
}