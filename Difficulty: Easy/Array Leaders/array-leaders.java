class Solution {
    static ArrayList<Integer> leaders(int nums[]) {
        // code here
         int n = nums.length; 
        int maxRight = nums[n-1]; 
        ArrayList <Integer> p = new ArrayList <>();
        
        p.add(nums[n-1]);
        for ( int i = n-2; i>=0 ; i --){
           if ( nums[i]>=maxRight){
               p.add(nums[i]);
               maxRight= nums[i];
           }
           

        }
           Collections.reverse(p);
        return p;
    }
}
