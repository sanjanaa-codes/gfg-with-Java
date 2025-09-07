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

class Solution {
    public String reverse(String S) {
        StringBuilder sb = new StringBuilder(S);
        return sb.reverse().toString();
        
    }
}

TC -> O(N)
SC -> O(N)
__________________________________________________________________________________________________
Approach 3 - Using Character Array In Place swaps

class Solution {
    public String reverse(String S) {
        char[] arr = S.toCharArray();
        int l = 0;
        int r = arr.length -1;
        char temp;
        while(l<r){
            temp = arr[r];
            arr[r]=arr[l];
            arr[l]=temp;
            l++;
            r--;
        }
        return new String(arr);
        
    }
}


