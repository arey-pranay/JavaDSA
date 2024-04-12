import java.util.*;

class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> ans = new ArrayList<>();
        if (root == null) return ans;

        Queue<TreeNode> q = new LinkedList<>();
        q.offer(root);
        boolean flag = true;

        while (!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();

            for (int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                if (flag) {
                    temp.add(node.val);
                } else {
                    temp.add(0, node.val); // Insert at the beginning for zigzag order
                }
                if (node.left != null) q.offer(node.left);
                if (node.right != null) q.offer(node.right);
            }

            ans.add(temp);
            flag = !flag; // Toggle the flag for zigzag direction
        }

        return ans;
    }
}
