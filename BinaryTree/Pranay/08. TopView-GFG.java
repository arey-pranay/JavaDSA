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
class Solution
{
    static class combo{
        Node x;
        int col;
        combo(Node x, int col){
            this.x = x;
            this.col = col;
        }
    }
    static ArrayList <Integer> topView(Node root)
    {
        // Code here
        TreeMap<Integer,Integer> h = new TreeMap<>();
        Queue<combo> q = new LinkedList<>();
        q.add(new combo(root,0));
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                combo temp = q.poll();
                if(!h.containsKey(temp.col))
                h.put(temp.col,temp.x.data);
                if(temp.x.left!=null){
                    q.add(new combo(temp.x.left,temp.col-1));
                }
                if(temp.x.right!=null){
                    q.add(new combo(temp.x.right,temp.col+1));
                }
            }
            
        }
        //System.out.print(h);
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry <Integer,Integer> entry: h.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}
