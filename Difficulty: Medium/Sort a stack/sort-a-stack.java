/*Complete the function below*/
class GfG {
    public Stack<Integer> insertSorted(Stack<Integer> stack, int element){
        if(stack.isEmpty() || stack.peek()<=element){
            stack.push(element);
            return stack;
        }
        int top = stack.pop();
        insertSorted(stack, element);
        stack.push(top);
        return stack;
    }
    public Stack<Integer> sort(Stack<Integer> stack) {
        // add code here.
        if (stack.isEmpty()) return stack;
        
        int top = stack.pop();
        sort(stack);
        insertSorted(stack, top);
        return stack;
    }
}