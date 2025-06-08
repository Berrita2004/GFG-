class Solution {
    // Recursive function to perform bubble sort
    public static void bubbleSort(int arr[]) {
        bubbleSort(arr, arr.length);
    }
    
    private static void bubbleSort(int arr[], int n) {
        // Base case
        if (n == 1) return;
        
        // One pass of bubble sort: move largest to the end
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i+1]) {
                int temp = arr[i];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
        // Recursive call for the rest
        bubbleSort(arr, n - 1);
    }
}