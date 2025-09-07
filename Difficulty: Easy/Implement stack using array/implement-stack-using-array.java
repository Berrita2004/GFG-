class MyStack {
int [] arr = new int [100005];
 int top = 0 ;
    public void push(int x) {
        // code here
        arr[top]= x;
        top++;
    }

    public int pop() {
        
        // code here
        if ( top == 0) return -1;
        top --;
        return arr[top];
    }
}
