class Solution {
    public String findLargest(int[] arr) {
        // code he re
        StringBuilder sb = new StringBuilder();

      String[] str = new String[arr.length];


    for (int i = 0; i < arr.length; i++) {
        str[i] = String.valueOf(arr[i]);
       }
     Arrays.sort(str, (a,b)-> (b+a).compareTo(a+b));
    for (String s : str) {
        sb.append(s);
    }
    if (str[0].equals("0")) return "0";

    return sb.toString();

    }
    
}