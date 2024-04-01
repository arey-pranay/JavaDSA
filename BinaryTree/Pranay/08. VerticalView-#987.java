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
class Solution {
    public List<List<Integer>> verticalTraversal(TreeNode root) {
        return new MyList(root);
    }
    static class MyList extends ArrayList<List<Integer>> {
        TreeNode root;

        public MyList(TreeNode treeNode) {
            this.root = treeNode;
        }
        public int size() {
            method();
            return super.size();
        }
        private void method() {
            if (root == null) return;
            HashMap<Integer, List<Info>> map = new HashMap<>();
            int minCol = method(root, map, 0, 0);
            int size = map.size() + minCol;
            List<List<Integer>> list = this;
            while (minCol < size) {
                List<Info> infos = map.get(minCol++);
                List<Integer> subRes = new ArrayList<>();
                list.add(subRes);
                infos.sort(Info::compareTo);
                for (Info i : infos)
                    subRes.add(i.val);
            }
            root = null;
        }
        public int method(TreeNode node, HashMap<Integer, List<Info>> map, int row, int col) {
            if (node == null)
                return 0;
            if (map.containsKey(col))
                map.get(col).add(new Info(row, node.val));
            else {
                ArrayList<Info> list = new ArrayList<>();
                list.add(new Info(row, node.val));
                map.put(col, list);
            }
            return Math.min(Math.min(method(node.left, map, row - 1, col - 1), col), 
                                    method(node.right, map, row - 1, col + 1));
        }
    }
    static class Info implements Comparable<Info> {
        private final int row;
        public final int val;

        public int compareTo(Info that) {
            return this.row == that.row ? this.val - that.val : that.row - this.row;
        }
        public Info(int row, int val) {
            this.row = row;
            this.val = val;
        }
    }
}
        
    
