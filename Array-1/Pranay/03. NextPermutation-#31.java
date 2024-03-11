class Solution {    
    public static void nextPermutation(int[] nums) {
        int n = nums.length;
        int i = n - 2;
        // Step 1: Find the first element from the right that breaks the increasing order
        while (i >= 0 && nums[i] >= nums[i + 1]) {
            i--;
        }
        // If i is found, find the next greater number to its right
        if (i >= 0) {
            int j = n - 1;
            while (j >= 0 && nums[j] <= nums[i]) {
                j--;
            }
            swap(nums, i, j); // Step 2: Swap nums[i] with nums[j]
        }

        // Step 3: Reverse the subarray from i+1 to n-1
        reverse(nums, i + 1, n - 1);
        // Arrays.sort(nums,i+1,n);

        // Print the next permutation
        System.out.println(Arrays.toString(nums));
    }

    public static void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }

    public static void reverse(int[] nums, int start, int end) {
        while (start < end) {
            swap(nums, start, end);
            start++;
            end--;
        }
    }
}
