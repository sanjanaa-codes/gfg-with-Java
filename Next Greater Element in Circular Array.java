-> Creating Array and returning as ArrayList
  
class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        int N = arr.length;
        Stack<Integer> st = new Stack<>();
        int[] out = new int[N];
        for(int i=2*N-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i%N]){
                st.pop();
            }
            if(i<N){
                out[i] = st.isEmpty()? -1:st.peek();
            }
            st.push(arr[i%N]);
        }
        ArrayList<Integer> list = new ArrayList<>();
        for(int ele:out ) list.add(ele);
        return list;
    }
}

________________________________________________________________
-> Directly Reversing ArrayList

class Solution {
    public ArrayList<Integer> nextGreater(int[] arr) {
        int N = arr.length;
        Stack<Integer> st = new Stack<>();
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=2*N-1;i>=0;i--){
            while(!st.isEmpty() && st.peek()<=arr[i%N]){
                st.pop();
            }
            if(i<N){
                list.add(st.isEmpty()? -1:st.peek());
            }
            st.push(arr[i%N]);
        }
        
        Collections.reverse(list);
        return list;
    }
}
