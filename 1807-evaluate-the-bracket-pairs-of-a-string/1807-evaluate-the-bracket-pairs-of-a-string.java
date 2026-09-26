class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String, String> map = new HashMap<>();
        for (List<String> pair : knowledge) {
            map.put(pair.get(0), pair.get(1));
        }
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '(') {
                ans.append(s.charAt(i));
            } else {
                i++;
                StringBuilder key = new StringBuilder();

                while (s.charAt(i) != ')') {
                    key.append(s.charAt(i));
                    i++;
                }
                String value = map.getOrDefault(key.toString(), "?");
                ans.append(value);
            }
        }
        return ans.toString();
    }
}