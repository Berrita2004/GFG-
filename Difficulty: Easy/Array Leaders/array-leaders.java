class Solution {
    static ArrayList<Integer> leaders(int arr[]) {
        // code here
        ArrayList <Integer> res = new ArrayList<>();
        int n = arr.length ;
        res.add(arr[n-1]);
        int max = arr[n-1];
        for (int i = n-2 ; i >= 0 ; i--){
            if (arr[i]>=max){
                max= arr[i];
                res.add(max);
            }
        }
        Collections.reverse(res);
        return res;
    }
}
