class Solution {
    // Function to return a list containing the DFS traversal of the graph.
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
        // Code here
        
        ArrayList<Integer> ans = new ArrayList<>();
        // ans.add(0);
        boolean[] visited = new boolean[V];
        for(int i=0;i<V;i++){
            if(!visited[i]){
                visited[i] = true;
                ans.add(i);
                dfs(i,adj,ans, visited);
            }
        }
        
        return ans;
    }
    public void dfs(int curr, ArrayList<ArrayList<Integer>> adj, ArrayList<Integer> ans, boolean[] vis){
        for(int i: adj.get(curr)){
            if(!vis[i]){
                vis[i] = true;
                ans.add(i);
                dfs(i,adj,ans,vis);
            }
        }
    }
}


// class Solution {
//     // Function to return a list containing the DFS traversal of the graph.
//     public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
//         boolean vis[] = new boolean[V];
//         vis[0] = true;
//         ArrayList<Integer> ans = new ArrayList<Integer>();
//         ans.add(0);
//         dfs(0,vis,ans,V,adj);
//         return ans;
//     }
//     public void dfs(int index, boolean[] vis, ArrayList<Integer> ans, int max,ArrayList<ArrayList<Integer>> adj){
//         if(ans.size()==max) return;
//         for(int j : adj.get(index)){
//                 if(!vis[j]){
//                     vis[j] = true;
//                     ans.add(j);
//                     dfs(j,vis,ans,max,adj);
//                 }
                
//         }
//         return;
//     }
// }

// class Solution {
//     public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
//        boolean[] visited = new boolean[V];
//         ArrayList<Integer> result = new ArrayList<>();
//         helper(0, adj, visited, result);
//         return result;
//     }
//     private static void helper(int vertex, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
//         visited[vertex] = true;
//         result.add(vertex);

//         for (int neighbor : adj.get(vertex)) {
//             if (!visited[neighbor]) {
//                 helper(neighbor, adj, visited, result);
//             }
//         }
//     }
// }
