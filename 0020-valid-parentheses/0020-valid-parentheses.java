class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(!st.isEmpty()){
                if(st.peek() == '(' && ch == ')' || st.peek() == '{' && ch == '}' || st.peek() == '[' && ch == ']'){
                    st.pop();
                    continue;
                }
            }
            st.push(ch);
        }
        return st.isEmpty();
        
    }
}