class Solution {
    public int maxSubArray(int[] a) {
        int size = a.length;
        int maxi = Integer.MIN_VALUE;
        int current = 0;
        for (int i = 0; i < size; i++) {
            //pehle a[i] ko lelo
            current = current + a[i];
            //agr abtk ka sum (current) maxi se bada aagya, to maxi update krdo
            maxi = Math.max(maxi,current);
            //agr current sum negetive hai, to reset krdo 0 se, kyuki negetive numbers se sum decrease hi hoga
            if (current < 0) current = 0;
        }
        return maxi;
    }
}
