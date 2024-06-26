/*
    Following is the TreeNode class structure:

    public class TreeNode {
        int data;
        TreeNode left;
        TreeNode right;
        TreeNode() {
            this.data = 0;
            this.left = null;
            this.right = null;
        }
        TreeNode(int val) {
            this.data = val;
            this.left = null;
            this.right = null;
        }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.data = val;
            this.left = left;
            this.right = right;
        }
    };
*/

import java.util.*;

public class Solution {

	//same as Inorder, just this time add the curr while creating the thread
	//in Inorder, just add the node while removing the thread

    //curr = root
//while(curr!=null)
    //pehle to lc dekho
        //agr null hai to add curr and move right
        //agr lc hai to uspe prev rkho and then rightmost find karo
            //keep going prev = prev.right until rc is null or rc is threaded
            //if rc is null then prev.rc = curr (thread) and curr = curr.left
            //else rc is threaded then prev.rc = null; q.add(curr); curr=curr.right;
    public static List<Integer> getPreOrderTraversal(TreeNode root) {
        //Morris Inorder Traversal
        List<Integer> ans = new ArrayList<>();
        //keep track of cuurrent and previous nodes
        TreeNode current, pre;
        if (root == null)
            return ans;
        //start from the root node
        current = root;
        //as long as you do not encounter null, keep going
        while (current != null) {
            //if there is no left child, add it to traversal, and go to the right child
            if (current.left == null) {
                ans.add(current.data);
                current = current.right;
            } else {
                // Find the inorder predecessor of current
                pre = current.left;
                //as long as right child is present and it is not creating a loop, keep going right
                while (pre.right != null && pre.right != current)
                    pre = pre.right;

                // Make current as right child of its inorder predecessor
                //if you reached null, then put a link to the current node
                if (pre.right == null) {
                    pre.right = current;
					ans.add(current.data);
                    current = current.left;
                } else { //if you came back to the original current node, then break the link
                //add the node, and move current to the right child
                    pre.right = null;
                    current = current.right;
                }
            }
        }
        return ans;
    }
}
