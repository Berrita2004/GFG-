class minHeap {
    //initialize an heapay 
ArrayList<Integer> heap;
        int size ;
    // Constructor
    public minHeap() {
        // Initialize your data members
       heap = new ArrayList<>();
       heap.add(0);
       size = 0;
        
    }

    public void push(int x) {
        // Insert x into the heap
       
        size ++;
        int idx = size ;
        heap.add(x);
        while(idx > 1){
            int parent = idx/2;
            if (heap.get(parent)> heap.get(idx)){
                int temp = heap.get(parent);
                heap.set(parent, heap.get(idx));
                heap.set(idx, temp);
                idx = parent ;
                
            }else break;
    
        }

    }

    public void pop() {
        // Remove the top (minimum) element
     
        if(size==0) return ;
        int i = 1 ;
         // replace root with last element
        heap.set(i, heap.get(size));
        //remove last elemnt

        heap.remove(size);
        //reduce size
        size--;
        
        while(2*i <=size ){
          int left = 2*i;
          int right = 2*i+1;
          int smallest = left;
           if (right <= size && heap.get(right) < heap.get(left)) {
               smallest = right;
            }
             if (heap.get(i) <= heap.get(smallest)) break;
             
             
             int temp = heap.get(i);
             heap.set(i, heap.get(smallest));
             heap.set(smallest, temp);


             i= smallest;
        }
            
        
        
    }

    public int peek() {
        // Return the top element or -1 if empty
         if (size == 0 ) return -1; 
            // Root element
            return heap.get(1); 
        
    }

    public int size() {
        // Return the number of elements in the heap
        return size;
    }
}