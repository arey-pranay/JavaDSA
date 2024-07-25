
class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        boolean vis[] = new boolean[V];
        vis[0] = true;
        ArrayList<Integer> ans = new ArrayList<Integer>();
        ans.add(0);
        dfs(0,vis,ans,V,adj);
        return ans;
    }
    public void dfs(int index, boolean[] vis, ArrayList<Integer> ans, int max,ArrayList<ArrayList<Integer>> adj){
        if(ans.size()==max) return;
        for(int j : adj.get(index)){
                if(!vis[j]){
                    vis[j] = true;
                    ans.add(j);
                    dfs(j,vis,ans,max,adj);
                }
                
        }
        return;
    }
}
