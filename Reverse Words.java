class Solution {
    public String reverseWords(String s) {
        String[] words = s.trim().split("\\.+");
        StringBuilder sb = new StringBuilder();
        for (int i = words.length - 1; i >= 0; i--) {
            sb.append(words[i]);
            if (i > 0) sb.append(".");
        }
        return sb.toString();
    }
}

_______________________________________________________________________________________________________
    
class Solution {
    public String reverseWords(String s) {
        StringBuilder sb = new StringBuilder();
        Stack<String> stack = new Stack<>();

        // Split by one or more dots and push non-empty words onto the stack
        for (String word : s.trim().split("\\.+")) {
            if (!word.isEmpty()) {
                stack.push(word);
            }
        }

        // Pop from stack to reverse order and add dots between words
        while (!stack.isEmpty()) {
            sb.append(stack.pop());
            if (!stack.isEmpty()) {
                sb.append(".");
            }
        }

        return sb.toString();
    }
}

