class Solution {
    // Function to return Breadth First Traversal of given graph.
    public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
       boolean[] visited = new boolean[V];
       Queue<Integer> q = new LinkedList<>();
       ArrayList<Integer> ans = new ArrayList<>();
       q.add(0);
       visited[0] = true;
       while(!q.isEmpty()){
           int curr = q.remove();
        //   if(visited[curr])continue;
           ans.add(curr);
           for(int i : adj.get(curr)){
               if(!visited[i]){
                   visited[i] = true;
                   q.add(i);
               }
           }
       }
       return ans;
    }
}

// class Solution {
//     // Function to return Breadth First Traversal of given graph.
//     public ArrayList<Integer> bfsOfGraph(int V, ArrayList<ArrayList<Integer>> adj) {
//         ArrayList<Integer> ans = new ArrayList<>();
//         Queue<Integer> q = new LinkedList<>();
//         boolean[] visited = new boolean[V];
//         q.add(0);
//         while(!q.isEmpty()){
//            // if(ans.size()==V) break;
//             int curr = q.remove();
//             if(!visited[curr]){
//                 ans.add(curr);
//                 visited[curr] = true;
//                 for(int temp :  adj.get(curr)) q.add(temp);
//             }
//         }
//         return ans;
//     }
// }
