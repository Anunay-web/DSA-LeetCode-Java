class Solution {
    public int[] findOrder(int numCourses, int[][] prerequisites) {
        int[] res = new int[numCourses];
        ArrayList<Integer>[] graph = new ArrayList[numCourses];
        for(int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }
        int[] indeg = new int[numCourses];
        for(int i = 0; i < prerequisites.length; i++) {
            int course = prerequisites[i][0];
            int pre = prerequisites[i][1];
            graph[pre].add(course);
            indeg[course]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < numCourses; i++) {
            if(indeg[i] == 0) {
                q.add(i);
            }
        }
        int j = 0;
        while(!q.isEmpty()) {
            int curr = q.remove();
            res[j++] = curr;
            for(int e : graph[curr]) {
                indeg[e]--;
                if(indeg[e] == 0) {
                    q.add(e);
                }
            }
        }
        if(j != numCourses) {
            return new int[0];
        }
        return res;
    }
}