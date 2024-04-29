import java.util.AbstractList;
class Solution {
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        return new AbstractList<List<Integer>>() {
            List<List<Integer>> ret;
            ArrayList<Integer> curr;
            void init() {
                if (ret != null) {
                    return;
                }
                ret = new LinkedList<>();
                curr = new ArrayList<>();
                Arrays.sort(candidates);
                rec(candidates, 0, target);
            }
            @Override
            public List<Integer> get(int index) {
                init();
                return ret.get(index);
            }
            @Override
            public int size() {
                init();
                return ret.size();
            }
            void rec(int[] candidates, int idx, int target) {
                if (target == 0) {
                    ret.add(new ArrayList<>(curr));
                    return;
                }
                for (int i = idx; i < candidates.length; i++) {
                    int num = candidates[i];
                    if (num > target) {
                        break;
                    }
                    curr.add(num);
                    rec(candidates, i, target - num);
                    curr.remove(curr.size() - 1);
                }
            }
        };
    }
}
