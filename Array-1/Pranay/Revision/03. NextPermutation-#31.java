class Solution {
    public void nextPermutation(int[] nums) {
        //start from last, find i
        //start from last, find j
        //swap i,j
        //reverse after i+1

        int n = nums.length;

        //set i to the breaking point
        int i = n-2;
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }

        //set j to the rightmost element greater than i
        int j = n-1;
        if (i >= 0) {
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j); // Step 2: Swap nums[i] with nums[j]
        }

        //reverse from i+1 to end
        reverse(nums,i+1);
    }
    private void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    private void reverse(int[] nums, int start) {
        int end = nums.length - 1;
        while (start < end) {
            swap(nums, start++, end--);
        }
    }
}
