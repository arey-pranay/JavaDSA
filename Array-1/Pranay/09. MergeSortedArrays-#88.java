class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //start traversing from the last non-zero elements 
        //and start appropriately filling the biggest elements from the absolute last index
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        //while none of the arrays the traversed
        while (i >= 0 && j >= 0) {
            if (nums1[i] >= nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        //if anything is left in nums2, put it to nums1
        while (j >= 0) {
            nums1[k--] = nums2[j--];
        }
        //if anything is left in nums1, let it be there, coz the answer is supposed to be in the nums1
    }
}
