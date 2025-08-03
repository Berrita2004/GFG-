class Solution {
   void merge(int arr[], int l , int mid , int r ){
       int n = arr.length;
       int [] temp = new int [r-l+1] ;
       int left = l ; 
       int right = mid +1;
       int idx= 0 ; 
       
       while(left <= mid && right <= r){
           if ( arr[left]<= arr[right]) {
               temp[idx] = arr[left];
               left ++;
               idx++;
           }
       else {
            temp[idx] = arr[right];
           right++;
           idx++;
       }
           
       }
       
       while (left <= mid ){
            temp[idx] = arr[left];
           left++;
           idx++;
           
       }
       while (right <= r){
           temp[idx] = arr[right];
           right++;
           idx++;
           
       }
       for( int i = 0 ; i < temp.length; i ++){
           arr[l+i]= temp[i];
       }
     
       
       
   }
    void mergeSort(int arr[], int l, int r) {
        // code here
     if ( l >= r) return ; 
     int mid = (l+r )/2 ;
     mergeSort(arr,  l,  mid );
     mergeSort(arr, mid +1 ,  r );
     merge( arr,  l ,  mid,  r);
    }
}