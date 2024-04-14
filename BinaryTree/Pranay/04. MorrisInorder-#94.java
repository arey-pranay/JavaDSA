import java.util.ArrayList;
import java.util.List;
//curr = root
//while(curr!=null)
    //pehle to lc dekho
        //agr null hai to add curr and move right
        //agr lc hai to uspe prev rkho and then rightmost find karo
            //keep going prev = prev.right until rc is null or rc is threaded
            //if rc is null then prev.rc = curr (thread) and curr = curr.left
            //else rc is threaded then prev.rc = null; q.add(curr); curr=curr.right;
    
public class Solution {
    public static List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> inorder = new ArrayList<>();
        TreeNode curr = root;
        while (curr != null) {
            if (curr.left == null) {
                inorder.add(curr.val);
                curr = curr.right;
            } else {
                TreeNode prev = curr.left;
                while (prev.right != null && prev.right != curr) {//already thread
                    prev = prev.right;
                }
                if (prev.right == null) {
                    prev.right = curr; // make thread
                    curr = curr.left;
                } else {
                    prev.right = null; // remove thread
                    inorder.add(curr.val);
                    curr = curr.right;
                }
            }
        }
        return inorder;
    }

}
