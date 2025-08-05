class Solution {
    int first = -1;
    int last = -1;

    int countFreq(int[] arr, int target) {
        // code here
        int n = arr.length;
        firstIdx(arr, n, target);
        lastIdx(arr, n, target);

        if (first == -1 || last == -1) return 0;

        int ans = last - first + 1;
        return ans;
    }

    public void firstIdx(int[] arr, int n, int target) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                first = mid;
                high = mid - 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }

    public void lastIdx(int[] arr, int n, int target) {
        int low = 0;
        int high = n - 1;

        while (low <= high) {
            int mid = (low + high) / 2;
            if (arr[mid] == target) {
                last = mid;
                low = mid + 1;
            } else if (arr[mid] < target) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
    }
}
