class Solution {
    public int maxSubArray(int[] nums) {
        int sum = nums[0];
        int ans = sum;
        for(int i=1;i<nums.length;i++){
           if(sum<0) sum=0;
           sum+=nums[i]; 
           ans = Math.max(ans,sum);
        }
        return ans;
    }
}
