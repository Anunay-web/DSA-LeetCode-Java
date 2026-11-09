class Solution {
    public String restoreString(String s, int[] indices) {
        char[] ch = s.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < indices.length; i++) {
            for (int j = 0; j < ch.length; j++) {
                if (indices[j] == i) {
                    sb.append(ch[j]);
                }
            }
        }
        return sb.toString();
    }
}