class Solution {
    static ArrayList<Integer> preGreaterEle(int[] arr) {
        // code here
            int n = arr.length;
            ArrayList<Integer> ans = new ArrayList<>();
            Stack <Integer> st = new Stack<>();
            for ( int i = 0 ; i < n ; i++){
                while (!st.isEmpty() && arr[st.peek()] <=arr[i]){
                    st.pop();
                }
                ans.add( st.isEmpty() ? -1 : arr[st.peek()]);
                st.push(i);
            }
            return ans ;
    }
}