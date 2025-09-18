class Solution {
    public static ArrayList<Integer> prevSmaller(int[] arr) {
        int n = arr.length;
        ArrayList<Integer> pse = new ArrayList<>(n);
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < n; i++) {
            // Pop until we find a smaller element
            while (!st.isEmpty() && st.peek() >= arr[i]) {
                st.pop();
            }

            // If stack is empty, no smaller element exists
            pse.add(st.isEmpty() ? -1 : st.peek());

            // Push current element for next iterations
            st.push(arr[i]);
        }
        return pse;
    }
}
