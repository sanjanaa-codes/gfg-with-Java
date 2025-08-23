
class Solution {
    static boolean isBalanced(String s) {
        Stack<Character> sk = new Stack<>();
        for(char i:s.toCharArray()){
            if(i == '(' || i == '{' || i =='['){
                sk.push(i);
            }
            else {
                if (sk.isEmpty()) return false;
                if((i == ')' && sk.pop()!= '(') ||(i == '}' && sk.pop()!= '{') || (i == ']' && sk.pop()!= '[')){
                    return false;
                }
            }
        }
        return sk.isEmpty();
    }
}
