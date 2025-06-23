class Solution {
    public Pair<Integer, Integer> getMinMax(int[] arr) {
        // Code Here
        int n = arr.length;
        int min = arr[0] ;
        int max = arr[0];
        for ( int i = 0 ; i < n ; i ++){
            if ( arr[i]> max){
                max = arr[i];
            }
             if (arr[i]< min){
                 min = arr[i];
             }
        }
        return new Pair<>(min , max );
    }
}
