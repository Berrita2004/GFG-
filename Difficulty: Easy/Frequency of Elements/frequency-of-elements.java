class Solution {
    public ArrayList<ArrayList<Integer>> countFreq(int[] arr) {
        // code here
        int n = arr.length ;
        HashMap<Integer,Integer> map = new HashMap <>();
        for ( int i = 0 ; i < n ; i++){
            int num = arr[i];
            if ( map.containsKey (num)){
                int count = map.get (num);
                map.put(num , count+1);
            }
            else {
                map.put(num, 1);
            }
        }
    ArrayList <ArrayList<Integer>> result = new ArrayList<>();
    ArrayList<Integer> keys = new ArrayList<>(map.keySet());
    Collections.sort(keys);
    
    for ( int key : keys){
        ArrayList<Integer> pair = new ArrayList<>();
        pair.add(key);
        pair.add(map.get(key));
        result.add(pair);
    }
    return result;
    }
}