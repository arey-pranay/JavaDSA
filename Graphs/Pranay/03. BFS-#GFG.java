class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        ArrayList<Integer> ans = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();
        boolean[] visited = new boolean[V];
        q.add(0);
        while(!q.isEmpty()){
           // if(ans.size()==V) break;
            int curr = q.remove();
            if(!visited[curr]){
                ans.add(curr);
                visited[curr] = true;
                for(int temp :  adj.get(curr)) q.add(temp);
            }
        }
        return ans;
    }
}
