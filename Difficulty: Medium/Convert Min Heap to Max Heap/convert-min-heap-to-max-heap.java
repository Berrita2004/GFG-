class Solution {
    // Function to convert min-heap to max-heap
    static void convertMinToMaxHeap(int n, int arr[]) {
        // Start from last non-leaf node and heapify each node
        for(int i = n/2 - 1; i >= 0; i--) {
            maxHeapify(arr, n, i);
        }
    }

    // Max-heapify (bubble down) function
    private static void maxHeapify(int arr[], int n, int i) {
        int largest = i;
        int left = 2*i + 1;
        int right = 2*i + 2;

        // Check if left child is larger
        if(left < n && arr[left] > arr[largest]) {
            largest = left;
        }

        // Check if right child is larger
        if(right < n && arr[right] > arr[largest]) {
            largest = right;
        }

        // If largest is not the parent, swap and recurse
        if(largest != i) {
            int temp = arr[i];
            arr[i] = arr[largest];
            arr[largest] = temp;

            maxHeapify(arr, n, largest);
        }
    }
}
