class Solution {
    public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> list = new ArrayList<>();
        addByLevel(root, 0, list);
        return list;
    }

    public static void addByLevel(TreeNode root, int level, List<List<Integer>> list) {
        if(root == null) return;

        if(list.size() == level) {
            List<Integer> currlist = new ArrayList<>();
            currlist.add(root.val);
            list.add(currlist);
        } else {
            list.get(level).add(root.val);
        }
        
        addByLevel(root.left, level + 1, list);
        addByLevel(root.right, level + 1, list);
    } 
}
