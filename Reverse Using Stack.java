https://www.geeksforgeeks.org/problems/reverse-a-string-using-stack/1
__________________________________________________________________________________________________
Approach 1 - StringBuilder and Stack
  
import java.util.*;

class Solution {
    public String reverse(String S) {
        Stack<Character> stack = new Stack<>();
        StringBuilder sb = new StringBuilder();
        for(char ch:S.toCharArray()){
            stack.push(ch);
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.toString();
    }
}

TC -> O(N)
SC -> O(N) - Extra stack
__________________________________________________________________________________________________
Approach 2 - Build in methods

