class Solution {
    ArrayList<Integer> findTwoElement(int arr[]) {
        // code here
        ArrayList<Integer> ans = new ArrayList<>();
        TreeMap<Integer, Integer> m = new TreeMap<>();
        for(int num:arr){
            int count = m.getOrDefault(num, 0);
            m.put(num, count+1);
        }
        int missing = -1, repeating = -1;
        for(int i=1;i<=arr.length;i++){
            int count = m.getOrDefault(i, 0);
            if(count==0) missing = i;
            if(count==2) repeating = i;
        }
        ans.add(repeating);
        ans.add(missing);
      
        return ans;
    }
}