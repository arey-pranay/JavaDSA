/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
class Solution {
    // Function to find the lowest common ancestor (LCA) of two given nodes in a binary tree
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        // Base case: if the current node is null or matches either p or q, return the current node
        if (root == null || root == q || root == p) {
            return root;
        }
      
        // Recur for the left subtree
        TreeNode l = lowestCommonAncestor(root.left, p, q);
        
        // Recur for the right subtree
        TreeNode r = lowestCommonAncestor(root.right, p, q);
        
        // If both left and right recursive calls return non-null, it means p and q are found in different
        // subtrees of the current node, so the current node is their LCA
        if (l != null && r != null) {
            return root;
        }
        
        // If only the left recursive call returns a non-null value, it means both p and q are found
        // in the left subtree, so return the result of the left recursive call
        if (l != null) {
            return l;
        }
        
        // If only the right recursive call returns a non-null value, it means both p and q are found
        // in the right subtree, so return the result of the right recursive call
        return r;
    }
}
