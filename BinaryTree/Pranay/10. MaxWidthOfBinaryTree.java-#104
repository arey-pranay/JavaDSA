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
    List<Integer>l=new ArrayList<>();
    int maxi=0;
    public void width(TreeNode root,int ind,int k)
    {
        if(root==null) return;
        if(k==l.size())
        l.add(ind);
        else
        maxi=Math.max(maxi,ind-l.get(k));
        width(root.left,(2*ind)+1,k+1);
        width(root.right,(2*ind)+2,k+1);


    }
    public int widthOfBinaryTree(TreeNode root) 
    {
        if(root==null) return 0;
        width(root,1,0);
        return maxi+1;


        
    }
}
