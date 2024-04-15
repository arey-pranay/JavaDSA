/************************************************************

 Following is the Binary Tree node structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;

     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 }

 ************************************************************/

import java.util.*;


public class Solution {
    public static List<Integer> traverseBoundary(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        if (root == null) return res;

        res.add(root.data); // Add root node to the result
        leftTrav(root.left, res); // Traverse left boundary
        leaves(root, res); // Traverse leaves
        rightTrav(root.right, res); // Traverse right boundary
        
        return res;
    }
    
    public static void leftTrav(TreeNode root, List<Integer> res) {
        if (root == null || (root.left == null && root.right == null)) return; // Base case
        
        res.add(root.data); // Add current node to the result
        if (root.left != null) leftTrav(root.left, res); // Recur for left child
        else leftTrav(root.right, res); // Recur for right child if left child is null
    }
    
    public static void leaves(TreeNode root, List<Integer> res) {
        if (root == null) return; // Base case
        
        if (root.left == null && root.right == null) res.add(root.data); // Add leaf node to the result
        leaves(root.left, res); // Recur for left child
        leaves(root.right, res); // Recur for right child
    }
    
    public static void rightTrav(TreeNode root, List<Integer> res) {
        if (root == null || (root.left == null && root.right == null)) return; // Base case
        
        if (root.right != null) rightTrav(root.right, res); // Recur for right child
        else rightTrav(root.left, res); // Recur for left child if right child is null
        res.add(root.data); // Add current node to the result
    }
}
