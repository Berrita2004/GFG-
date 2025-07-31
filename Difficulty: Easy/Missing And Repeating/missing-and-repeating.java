class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        int n = arr.length;
        int xor = 0;

        for (int i = 0; i < n; i++) {
            xor ^= arr[i];
            xor ^= (i + 1);
        }

        int num = (xor & ~(xor - 1));
        int zero = 0, one = 0;

        for (int i = 0; i < n; i++) {
            if ((arr[i] & num) != 0) one ^= arr[i];
            else zero ^= arr[i];
        }

        for (int i = 1; i <= n; i++) {
            if ((i & num) != 0) one ^= i;
            else zero ^= i;
        }

        int cnt = 0;
        for (int i = 0; i < n; i++) {
            if (arr[i] == zero) cnt++;
        }

        ArrayList<Integer> result = new ArrayList<>();
        if (cnt == 2) {
            result.add(zero); // duplicate
            result.add(one);  // missing
        } else {
            result.add(one);  // duplicate
            result.add(zero); // missing
        }
        return result;
    }
}
