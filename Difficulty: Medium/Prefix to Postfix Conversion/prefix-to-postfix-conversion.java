// User function Template for Java

class Solution {
    static String preToPost(String pre_exp) {
        // code here
        Stack <String> st = new Stack<>();
        for ( int i = pre_exp.length()-1; i >= 0 ; i--){
            char c = pre_exp.charAt(i);
            if (Character.isLetterOrDigit(c)){
                st.push(c+"");
            }
            else {
                String t1 = st.pop();
                String t2 = st.pop();
                String con = t1 + t2 + c;
                st.push(con);
            }
        }
        return st.peek();
    }
}
