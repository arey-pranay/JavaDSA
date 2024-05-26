class Solution {
    public ArrayList<Integer> dfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       boolean[] visited = new boolean[V];
        ArrayList<Integer> result = new ArrayList<>();
        helper(0, adj, visited, result);
        return result;
    }
    private static void helper(int vertex, ArrayList<ArrayList<Integer>> adj, boolean[] visited, ArrayList<Integer> result) {
        visited[vertex] = true;
        result.add(vertex);

        for (int neighbor : adj.get(vertex)) {
            if (!visited[neighbor]) {
                helper(neighbor, adj, visited, result);
            }
        }
    }
}
