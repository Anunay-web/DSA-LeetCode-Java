class Solution {
    public int matchPlayersAndTrainers(int[] players, int[] trainers) {
        int count = 0;
        Arrays.sort(players);
        Arrays.sort(trainers);
        int pl = players.length - 1;
        int tr = trainers.length - 1;
        while(pl >= 0 && tr >= 0){
            if(players[pl] <= trainers[tr]){
                count++;
                pl--;
                tr--;
            }
            else{
                pl--;
            }
        }
        return count;
        
    }
}