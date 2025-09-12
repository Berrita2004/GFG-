import java.util.*;

class Solution {
    Deque<Integer> stack;
    Deque<Integer> minStack;

    public Solution() {
        stack = new ArrayDeque<>();
        minStack = new ArrayDeque<>();
    }

    public void push(int x) {
        stack.push(x);
        if (minStack.isEmpty() || x <= minStack.peek()) {
            minStack.push(x);
        }
    }

    public int pop() {
        if (stack.isEmpty()) return -1;
        int removed = stack.pop();
        if (removed == minStack.peek()) {
            minStack.pop();
        }
        return removed; // returning actual popped value
    }

    public int peek() {
        if (stack.isEmpty()) return -1;
        return stack.peek();
    }

    public int getMin() {
        if (minStack.isEmpty()) return -1;
        return minStack.peek();
    }
}
