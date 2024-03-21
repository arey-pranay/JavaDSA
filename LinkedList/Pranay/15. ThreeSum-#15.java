import java.util.*;

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Set<List<Integer>> s = new HashSet<>(); // Set banayein unique triplets ke liye
        Arrays.sort(nums); // Array ko sort karein
        int n = nums.length; // Array ki length nikalein
        for (int i = 0; i < n - 2; i++) { // Pehla element tak loop chalayein
            int j = i + 1; // Dusra element ko pehle element ke baad rakhein
            int k = n - 1; // Tisra element ko array ka ant se shuruat karke rakhein
            while (j < k) { // Jab tak second aur third pointers ek doosre se milte na ho
                int sum = nums[i] + nums[j] + nums[k]; // Teeno elements ka sum nikalein
                if (sum == 0) { // Agar teeno ka sum zero hai (Valid triplet)
                    List<Integer> triplet = new ArrayList<>(); // Naya list banayein
                    triplet.add(nums[i]); // Pehle element ko list mein daalein
                    triplet.add(nums[j]); // Dusra element ko list mein daalein
                    triplet.add(nums[k]); // Tisra element ko list mein daalein
                    s.add(triplet); // Triplets set mein daalein
                    j++; // Dusra pointer ko aage badhayein
                    k--; // Teesra pointer ko peeche le jayein
                } else if (sum < 0) { // Agar sum chhota hai zero se (Dusra pointer ko badhayein)
                    j++;
                } else { // Agar sum bada hai zero se (Tisra pointer ko kam karein)
                    k--;
                }
            }
        }
        List<List<Integer>> answer = new ArrayList<>(s); // Set ko list mein convert karein
        return answer; // Answer ko vapas karein
    }
}
