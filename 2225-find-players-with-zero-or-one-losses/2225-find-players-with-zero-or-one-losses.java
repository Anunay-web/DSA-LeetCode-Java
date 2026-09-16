class Solution {
    public List<List<Integer>> findWinners(int[][] matches) {
        Map<Integer, Integer> winnerMap = new HashMap<>();
        Map<Integer, Integer> looserMap = new HashMap<>();

        for(int [] m : matches){
            int winner = m[0];
            int looser = m[1];

            winnerMap.put(winner, winnerMap.getOrDefault(winner, 0) + 1);
            looserMap.put(looser, looserMap.getOrDefault(looser, 0) + 1);
        }

        List<Integer> Winnerls = new ArrayList<>();
        List<Integer> Looserls = new ArrayList<>();
        
        for(int p : winnerMap.keySet()){
            if(!looserMap.containsKey(p)){
                Winnerls.add(p);
            }
        }

        for(Map.Entry<Integer, Integer> loose : looserMap.entrySet()){
            if(loose.getValue() == 1){
            Looserls.add(loose.getKey());
            }
        }

        Collections.sort(Winnerls);
        Collections.sort(Looserls);

        List<List<Integer>> res = new ArrayList<>();

        res.add(Winnerls);
        res.add(Looserls);
        return res;
    }
}