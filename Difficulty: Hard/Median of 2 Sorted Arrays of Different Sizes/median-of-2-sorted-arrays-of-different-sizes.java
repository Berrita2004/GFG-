class Solution {
    public double medianOf2(int a[], int b[]) {
        int al = a.length;
        int bl = b.length;
        int[] mer = new int[al + bl];

        int i = 0, j = 0, k = 0;

        // Merge both arrays into mer[]
        while (i < al && j < bl) {
            if (a[i] < b[j]) {
                mer[k++] = a[i++];
            } else {
                mer[k++] = b[j++];
            }
        }

        while (i < al) {
            mer[k++] = a[i++];
        }

        while (j < bl) {
            mer[k++] = b[j++];
        }

        int n = al + bl;

        if (n % 2 == 1) {
            return (double) mer[n / 2];  // odd → middle element
        }

        // even → average of middle two elements
        return ((double) mer[n / 2] + (double) mer[(n / 2) - 1]) / 2.0;
    }
}
