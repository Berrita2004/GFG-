// User function Template for Java

class Solution {
    static String postToInfix(String exp) {
        // code here
         Stack <String> st = new Stack<>();
        int i =  0;
        
        while ( i < exp.length()){
            char c = exp.charAt(i);
            if (Character.isLetterOrDigit(c)){
                st.push(c+"");
            }
            else {
                String t1 = st.pop();
                String t2 = st.pop();
                String con = "("  + t2 + c+ t1 +")";
                st.push(con);
            }
            i++;
        
        }
         return st.peek();
    }
}
