
class Solution {
    public int[][] merge(int[][] intervals) {
        Arrays.sort(intervals, Comparator.comparingInt(o -> o[0]));

        int lastEndTime = intervals[0][1];
        int lastStartTime = intervals[0][0];

        List<List<Integer>> ls = new ArrayList<>();

        for (int i = 1; i < intervals.length; i++) {
            if (lastEndTime >= intervals[i][0]) {
                lastStartTime = Math.min(lastStartTime, intervals[i][0]);
                lastEndTime = Math.max(lastEndTime, intervals[i][1]);
            } else {
                ls.add(Arrays.asList(lastStartTime, lastEndTime));

                lastStartTime = intervals[i][0];
                lastEndTime = intervals[i][1];
            }
        }

        ls.add(Arrays.asList(lastStartTime, lastEndTime));

        int[][] res = new int[ls.size()][2];

        for (int i = 0; i < res.length; i++) {
            List<Integer> li = ls.get(i);
            res[i][0] = li.get(0);
            res[i][1] = li.get(1);
        }

        return res;
    }
}