import java.util.* ;
class Solution {
    // Function to sort the array using bubble sort algorithm.
    public static void bubbleSort(int arr[]) {
        // code here
        int n = arr.length;
        for ( int i = n-1; i>= 1; i--){
        
            for ( int j = 0 ; j <= i-1; j++){
         
                if (arr[j]>arr[j+1]){
                   int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
                
            }
            
        }
    }
}