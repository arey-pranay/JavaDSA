import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

//ChatGPT Approach
class Solution {
    public int widthOfBinaryTree(TreeNode root) {
        if (root == null) return 0;
        
        Queue<TreeNode> queue = new LinkedList<>();
        Queue<Integer> indices = new LinkedList<>();
        queue.offer(root);
        indices.offer(1); // Start index of the root node
        
        int maxWidth = 0;
        while (!queue.isEmpty()) {
            int size = queue.size();
            int leftMostIndex = indices.peek();
            int rightMostIndex = leftMostIndex; // Initialize rightMostIndex to leftMostIndex
            
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                int index = indices.poll();
                
                if (node.left != null) {
                    queue.offer(node.left);
                    indices.offer(2 * index);
                }
                
                if (node.right != null) {
                    queue.offer(node.right);
                    indices.offer(2 * index + 1);
                }
                
                // Update the rightMostIndex at each level
                rightMostIndex = index;
            }
            
            // Calculate the width at the current level
            maxWidth = Math.max(maxWidth, rightMostIndex - leftMostIndex + 1);
        }
        
        return maxWidth;
    }
}

// My Approach, yet to be made better..
// class Solution {
//     public int widthOfBinaryTree(TreeNode root) {
//         ArrayList<TreeNode> arr = new ArrayList<>();
//         TreeNode curr = root;
//         arr.add(curr);
//         int maxi = 1;
//         while(!arr.isEmpty()){
//             int size = arr.size();
//             for(int i=0;i<size;i++){
//                 if(arr.get(0)==null){
//                     arr.remove(0);
//                     arr.add(null);
//                     arr.add(null);
//                 } else {
//                     TreeNode temp = arr.remove(0);
//                     if(temp.left!=null) arr.add(temp.left); else arr.add(null);
//                     if(temp.right!=null) arr.add(temp.right); else arr.add(null);
//                 }
                
//             }
//             int i=arr.size()-1;
//             while(i>=0 && arr.get(i)==null ){
//                 arr.remove(i);
//                 i--;
//             }
//             maxi = Math.max(maxi,arr.size());
//         }
//         return maxi;
//     }
// }
