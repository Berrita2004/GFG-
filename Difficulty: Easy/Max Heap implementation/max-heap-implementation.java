class maxHeap {
    ArrayList<Integer> heap;
    int size ;

    // Constructor
    public maxHeap() {
        // Initialize your data members
        heap = new ArrayList<>();
        heap.add(0);
        size = 0 ;
    }

    public void push(int x) {
        // Insert x into the heap
        size ++;
        int idx = size;
        heap.add(x);
        while(idx > 1){
            int parent = idx/2;
            if(heap.get(parent)< heap.get(idx)){
                int temp = heap.get(parent);
                heap.set(parent , heap.get(idx));
                heap.set(idx, temp);
                idx = parent;
            }else break;
        }
        
    }

    public void pop() {
        // Remove the top (maximum) element
        if (size == 0) return;
        int i = 1;
        heap.set(i, heap.get(size));
        heap.remove(size);
        size--;
        
        while(2*i <= size){
            int left = 2*i;
            int right = 2*i+1;
            int largest = left;
            if (right <= size && heap.get(right) > heap.get(left)) {
               largest = right;
            }
            if (heap.get(i) >= heap.get(largest)) break;
             
            int temp = heap.get(i);
            heap.set(i, heap.get(largest));
            heap.set(largest, temp);

            i= largest;
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