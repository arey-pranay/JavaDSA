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
