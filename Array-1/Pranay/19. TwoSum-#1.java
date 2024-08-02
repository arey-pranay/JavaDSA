class Solution {
    public int[] twoSum(int[] nums, int target) {
        HashMap<Integer, Integer> hm = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(hm.containsKey(target-nums[i])) return new int[]{hm.get(target-nums[i]),i};
            hm.put(nums[i],i);
        }
        return new int[] {-1,-1};
    }
}

// class Solution {
//     public int[] twoSum(int[] nums, int target) {
//        for(int i=1;i<nums.length;i++)
//             {
//                 for(int j=i;j<nums.length;j++)
//                 {
//                     if(nums[j-i]+nums[j]==target)
//                     {
//                         return new int[]{j-i,j};
//                     }
//                 }
//             }
        
//         return new int[]{};
//     }
// }
