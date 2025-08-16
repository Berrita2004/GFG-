class Solution {
    // Lower bound on a 1D row
    public int lowerBound(int[] row, int x) {
        int n = row.length;
        int low = 0, high = n - 1;
        while (low <= high) {
            int mid = (low + high) / 2;
            if (row[mid] >= x) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        return low; // first index where element >= x
    }

    public int rowWithMax1s(int arr[][]) {
        int n = arr.length;
        int m = arr[0].length;
        int count = 0;
        int idx = -1;

        for (int i = 0; i < n; i++) {
            int pos = lowerBound(arr[i], 1); // pass 1D row
            int cnt_one = m - pos;           // number of 1s in row
            if (cnt_one > count) {
                count = cnt_one;
                idx = i;
            }
        }
        return idx;
    }
}
