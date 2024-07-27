class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int i = m-1;
        int j = n-1;
        int curr = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i] > nums2[j] ){
                nums1[curr--] = nums1[i--]; 
            } else {
                nums1[curr--] = nums2[j--];
            }
        }
        while(i >= 0){
            nums1[curr--] = nums1[i--];
        }
        while(j >= 0){
            nums1[curr--] = nums2[j--];
        }
        return;
    }
}
