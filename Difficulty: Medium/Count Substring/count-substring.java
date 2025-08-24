class Solution {
    public static int countSubstring(String s) {
        // code here
      
        int n = s.length();
        int[] count = new int[3]; // counts for a,b,c
        int res = 0;
        int l = 0;

        for (int r = 0; r < n; r++) {
            count[s.charAt(r) - 'a']++;

            // shrink left pointer while all a,b,c are present
            while (count[0] > 0 && count[1] > 0 && count[2] > 0) {
                res += n - r; // every substring from l..r to l..n-1 is valid
                count[s.charAt(l) - 'a']--;
                l++;
            }
        }
        return res;
    }
}


