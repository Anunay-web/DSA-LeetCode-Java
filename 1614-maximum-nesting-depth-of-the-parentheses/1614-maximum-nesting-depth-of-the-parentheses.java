class Solution {
    public int maxDepth(String s) {
        int count = 0;
        int current  = 0;
        Stack<Character> st = new Stack<>();
        for(int i = 0; i < s.length(); i++){
            char ch = s.charAt(i);
            if(ch == '('){
                st.push(ch);
                current++;
                count = Math.max(count, current);

            }
            else if(!st.isEmpty() && ch == ')'){
                st.pop();
                current--;
            }
        }
        return count;

    }
}