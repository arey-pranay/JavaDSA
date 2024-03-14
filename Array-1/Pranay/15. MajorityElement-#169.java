class Solution {
    public int majorityElement(int[] nums) {
        int count = 0;
        int candidate = 0;        
        for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            
            if (num == candidate) {
                count++;
            } else {
                count--;
            }
        }
        
        return candidate;
    }
}
// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         return nums[n/2];
//     }
// }
// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         int maxN = Arrays.stream(nums).max().getAsInt();
//         int minN = Math.abs(Arrays.stream(nums).min().getAsInt());
//         int[] arrP = new int[maxN+1];
//         int[] arrN = new int[minN+1];
//         for(int i=0;i<n;i++){
//            if(nums[i]<0){
//             arrN[Math.abs(nums[i])]++;
//             if(arrN[Math.abs(nums[i])]>Math.floor(n/2)) return nums[i];
//            } else{
//             arrP[nums[i]]++;
//             if(arrP[nums[i]]>Math.floor(n/2)) return nums[i];
//            } 
         
//         }
//         return 0;
//     }
// }
