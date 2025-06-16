class Solution {
    int findFrequency(int arr[], int x) {
        // code here
        int n = arr.length;
        HashMap <Integer,Integer> map = new HashMap<>();
        // traversing using for loop ;
        for ( int i = 0 ; i < n ; i ++){
            int num = arr[i];
            
        // now we check if we have the element present or not in hash map 
        if (map.containsKey(num)){
            int count = map.get(num);
            map.put(num, count +1);
        }
        else {
            map.put(num,1);
        }
        }
        if (map.containsKey(x)){
            return map.get(x);
        }
        else {
            return 0 ; 
        }
    }
    
}