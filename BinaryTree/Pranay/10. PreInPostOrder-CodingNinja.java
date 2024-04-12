/*********************************************************

 Following is the TreeNode structure:

 class TreeNode {
     int data;
     TreeNode left;
     TreeNode right;
     TreeNode() {
         this.data = 0;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
     TreeNode(int data, TreeNode left, TreeNode right) {
         this.data = data;
         this.left = left;
         this.right = right;
     }
 };
 ********************************************************/

import java.util.*;
public class Solution {
    public static List<List<Integer>> getTreeTraversal(TreeNode root) {
        // Write your code here.
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> in = new ArrayList<>();
        inorder(in,root);
        ans.add(in);
        List<Integer> pre = new ArrayList<>();
        preorder(pre,root);
        ans.add(pre);
        List<Integer> post = new ArrayList<>();
        postorder(post,root);
        ans.add(post);
        return ans;
    }
    public static void inorder(List<Integer> temp, TreeNode root){
        if(root==null) return;
        inorder(temp,root.left);
        temp.add(root.data);
        inorder(temp,root.right);
    }

     public static void preorder(List<Integer> temp, TreeNode root){
        if(root==null) return;
        temp.add(root.data);
        preorder(temp,root.left);
        preorder(temp,root.right);
    }

     public static void postorder(List<Integer> temp, TreeNode root){
        if(root==null) return;
        postorder(temp,root.left);
        postorder(temp,root.right);
        temp.add(root.data);
    }
}
