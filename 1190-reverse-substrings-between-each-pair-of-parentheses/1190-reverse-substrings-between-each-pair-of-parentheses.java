class Solution {
    public String reverseParentheses(String s) {
        Stack<Character> st = new Stack<>();
        for(char ch : s.toCharArray()){
            if(ch == ')'){
                StringBuilder str = new StringBuilder();
                while(st.peek()!='('){
                    str.append(st.pop());
                }
                st.pop();
                for(char c : str.toString().toCharArray()){
                    st.push(c);
                }
                continue;
                
            }
            st.push(ch);
        }
        StringBuilder str = new StringBuilder();

        while(!st.isEmpty()){
            str.append(st.pop());
        }

        return str.reverse().toString();
        
    }
}