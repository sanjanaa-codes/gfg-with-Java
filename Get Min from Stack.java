import java.util.*;
class SpecialStack {
    
    private Stack<int[]> stack;
    
    public SpecialStack() {
        stack = new Stack<>();
    }

    public void push(int x) {
        // Add an element to the top of Stack
        if(stack.isEmpty()){
            stack.push(new int[]{x,x});
        }
        else{
            int minSoFar = Math.min(x,stack.peek()[1]);
            stack.push(new int[]{x, minSoFar});
        }
    }

    public void pop() {
        // Remove the top element from the Stack
        if (!stack.isEmpty()) {
            stack.pop();
        }
    }

    public int peek() {
        // Returns top element of the Stack
        if (!stack.isEmpty()) {
            return stack.peek()[0];
        }   
        return -1;
    }

    boolean isEmpty() {
        // Check if the stack is empty
        return stack.isEmpty();
    }

    public int getMin() {
        // Finds minimum element of Stack
        if (!stack.isEmpty()) {
            return stack.peek()[1];
        }
        return -1;
    }
}
