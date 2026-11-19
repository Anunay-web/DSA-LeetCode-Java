class Solution {
    public int findContentChildren(int[] g, int[] s) {
        int count = 0;
        Arrays.sort(g);
        Arrays.sort(s);
        int ch = g.length - 1;
        int pa = s.length - 1;
        while(ch >= 0 && pa >= 0){
            if(g[ch] <= s[pa]){
                count++;
                ch--;
                pa--;
            }
            else{
                ch--;
            }
        }
        return count;
        
    }
}