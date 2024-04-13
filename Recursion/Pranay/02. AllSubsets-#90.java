import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Solution {
    public List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        int[] subset = new int[nums.length]; // Ek subset ka khali array banao
        Arrays.sort(nums); // Array ko sort karo taki duplicate elements ke saath sahi taur par deal kiya ja sake
        generateSubsets(nums, 0, false, subset, 0, ans); // Subsets banane ke liye helper function ko bulao
        return ans;
    }
    //current mtlb input me kahan tk traverse krliya hia, to wo humesha +1 hoga
    //index mtlb abhi kahan tk fill krdi hai new temporary array
    public void generateSubsets(int[] nums, int current, boolean taken, int[] subset, int index, List<List<Integer>> ans) {
        // Agar hum array ke ant tak pahunch gaye hain
        if (current == nums.length) {
            // Toh ek naya subset banake ans mein add karo
            List<Integer> newSubset = new ArrayList<>();
            for (int i = 0; i < index; i++) {
                newSubset.add(subset[i]);
            }
            ans.add(newSubset);
            return;
        }

        // Agar yeh ek naya element hai ya fir yeh pehle se hi le liya gaya element nahi hai
        if (!(current > 0 && !taken && nums[current - 1] == nums[current])) {
            // Toh is element ko subset mein shamil karo
            subset[index] = nums[current];
            generateSubsets(nums, current + 1, true, subset, index + 1, ans);
        }
        // Is element ko chhodkar baki ke subsets ke liye recursion karo
        generateSubsets(nums, current + 1, false, subset, index, ans);
    }
}
