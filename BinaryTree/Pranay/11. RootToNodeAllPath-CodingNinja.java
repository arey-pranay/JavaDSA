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
import java.util.*;
public class Solution {
    public static List<String> allRootToLeaf(BinaryTreeNode root) {
        List<String> ans = new ArrayList<>();
        BinaryTreeNode curr = root;
        String s = "";
        calc(curr,s,ans);
        return ans;
    }
    public static void calc(BinaryTreeNode curr, String s, List<String> ans){
        s += Integer.toString(curr.data);
        s += " ";
        if(curr.left==null&&curr.right==null){
            ans.add(s);
            return;
        }
        if(curr.left!=null) calc(curr.left,s,ans);
        if(curr.right!=null) calc(curr.right,s,ans);
    }
}
