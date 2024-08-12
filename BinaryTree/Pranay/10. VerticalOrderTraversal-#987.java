/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    class combo{
        TreeNode x;
        int col;
        combo(TreeNode x,int col){
            this.x = x;
            this.col = col;
        }
    }
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        TreeMap<Integer,List<Integer>> ans = new TreeMap<>();
        combo start = new combo(root,0);
        Queue<combo> q = new LinkedList<>();
        q.add(start);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                combo curr = q.remove();                
                if(ans.containsKey(curr.col)){
                    List<Integer> temp = ans.get(curr.col);
                    temp.add(curr.x.val);
                    ans.put(curr.col, temp);
                } else {
                    List<Integer> temp = new ArrayList<>(); 
                    temp.add(curr.x.val);
                    ans.put(curr.col, temp);
                }
                if(curr.x.left!=null)q.add(new combo(curr.x.left,curr.col -1));
                if(curr.x.right!=null)q.add(new combo(curr.x.right, curr.col+1));
            }
        }
        List<List<Integer>> a = new ArrayList<>();
        for(int temp : ans.keySet()){
            a.add(ans.get(temp));
        }
        return a;
    }
}

// class Solution {
//     public List<List<Integer>> verticalTraversal(TreeNode root) {
//         //a hashmap (treemap) to store the list of all elements acc to col (ascending columns)
//         TreeMap<Integer,ArrayList<Integer>> hm = new TreeMap<>();
//         //a custom class / ds, to store each node with column number
//         Pair start = new Pair(0,root);
//         //a queue for level order traversal
//         Queue<Pair> q = new LinkedList<>();
//         q.add(start);
//         //let us start the level order traversal
//         while(!q.isEmpty()){
//             //store size because it'll change on adding more elements and removing them in the loop itself
//             int sz = q.size();
//             for(int i=0;i<sz;i++){
//                 Pair temp = q.remove();
//                 ArrayList<Integer> updatedList =  hm.getOrDefault(temp.col, new ArrayList<Integer>());
//                 updatedList.add(temp.n.val); 
//                 System.out.println(updatedList);
//                 hm.put(temp.col,updatedList);
//                 if(temp.n.left!=null) q.offer(new Pair(temp.col-1,temp.n.left));
//                 if(temp.n.right!=null) q.offer(new Pair(temp.col+1,temp.n.right));
//             }
//         }
//         List<List<Integer>> ans = new ArrayList<>();
//         for(Map.Entry<Integer,ArrayList<Integer>> e : hm.entrySet()){
//             System.out.println(e.getKey());
//             ans.add(e.getValue());
//         }
//         return ans;
//     }
//     public class Pair{
//         int col;
//         TreeNode n;
//         Pair(int col, TreeNode node){
//             this.col = col;
//             this.n = node;
//         }
//     }
// }
