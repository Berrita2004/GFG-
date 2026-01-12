class Solution {
    public int longestKSubstr(String s, int k) {
        // code 
        
        int l = 0 ; 
        int n = s.length();
        int maxLen = 0 ; 
        HashMap <Character, Integer> map = new HashMap<>();
        for ( int r = 0 ; r<n; r++){
            char c = s.charAt(r);
            map.put(c,map.getOrDefault(c,0)+1);
            
            while(map.size()>k){
                char leftch = s.charAt(l);
                map.put(leftch, map.get(leftch)-1);
                
                if (map.get(leftch)== 0 ){
                    map.remove(leftch);
                }    
                l++;
            }
            if (map.size()==k){
            maxLen = Math.max(maxLen , r-l+1);
            }
            
    
        }   
        if (maxLen == 0) return -1;
        return maxLen;
    }
    
}