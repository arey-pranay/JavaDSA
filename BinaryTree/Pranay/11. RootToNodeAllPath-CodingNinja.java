/********************************************************************

 Following is the class structure of the Node class:

 class BinaryTreeNode {
     int data;
     BinaryTreeNode left;
     BinaryTreeNode right;

     BinaryTreeNode(int data) {
         this.data = data;
         this.left = null;
         this.right = null;
     }
 };

 ********************************************************************/
// import java.util.*;
// public class Solution {
//     public static List<String> allRootToLeaf(BinaryTreeNode root) {
//         List<String> ans = new ArrayList<>();
//         BinaryTreeNode curr = root;
//         String s = "";
//         calc(curr,s,ans);
//         return ans;
//     }
//     public static void calc(BinaryTreeNode curr, String s, List<String> ans){
//         s += Integer.toString(curr.data);
//         s += " ";
//         if(curr.left==null&&curr.right==null){
//             ans.add(s);
//             return;
//         }
//         if(curr.left!=null) calc(curr.left,s,ans);
//         if(curr.right!=null) calc(curr.right,s,ans);
//     }
// }

class Solution {
    public static ArrayList<ArrayList<Integer>> Paths(Node root) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<>();
        ArrayList<Integer> curr = new ArrayList<>();
        func(root,curr,ans);
        return ans;
    }
    public static void func(Node root, ArrayList<Integer> curr, ArrayList<ArrayList<Integer>> ans){
        ArrayList<Integer> a = new ArrayList<>();
        for(int i: curr) a.add(i);
        if(root.left==null && root.right==null){
            a.add(root.data);
            ans.add(a);
            return;
        }
        a.add(root.data);
        if(root.left!=null) func(root.left,a,ans);
        if(root.right!=null) func(root.right,a,ans);
        return;
    }
}
