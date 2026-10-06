class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st = new Stack<>();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(!st.isEmpty() && st.peek() == '(' && ch == ')'){
                st.pop();
                count--;
                continue;
            }
            st.push(ch);
            count++;
        }
        return Math.abs(count);
    }
}