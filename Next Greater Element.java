https://www.geeksforgeeks.org/problems/next-larger-element-1587115620/1

import java.util.*;

class Solution {
    public ArrayList<Integer> nextLargerElement(int[] arr) {
        ArrayList<Integer> newarr = new ArrayList<>();
        Stack<Integer> stack = new Stack<>();

        // Traverse array from right to left
        for (int i = arr.length - 1; i >= 0; i--) {
            // Pop all smaller or equal elements
            while (!stack.isEmpty() && stack.peek() <= arr[i]) {
                stack.pop();
            }

            // If stack empty → no greater element
            if (stack.isEmpty()) {
                newarr.add(-1);
            } else {
                newarr.add(stack.peek());
            }

            // Push current element
            stack.push(arr[i]);
        }

        // Since we filled answers from right to left, reverse them
        Collections.reverse(newarr);
        return newarr;
    }
}





✅ Time Complexity

Each element is pushed onto the stack once and popped at most once.
So total operations across the loop = O(n).
Collections.reverse(newarr) also takes O(n).
👉 Overall Time Complexity = O(n)

✅ Space Complexity
stack holds at most n elements → O(n).
newarr stores the result of size n → O(n).
👉 Overall Space Complexity = O(n)
