public class Solution {
    // DO NOT MODIFY THE ARGUMENTS WITH "final" PREFIX. IT IS READ ONLY
    public int[] repeatedNumber(final int[] A) {
        int[] results = new int[2];
        int n = A.length;
        boolean duplicate[] = new boolean[n+1];
        // long idealSum = (n*(n+1)/2);
        // long sum =0;
        for(int i : A){
            if(duplicate[i] == true) {
                results[0] = i;
            } 
            // sum += i;
            duplicate[i] = true;
        } 
        // results[1] = (int)(idealSum - (sum-results[0]));
        for(int i=1;i<n+1;i++){
            if(duplicate[i]==false){
                results[1] = i;
                break;
            }
        }
        // results[1] = Math.idealSum - sum;
        return results;
    }
}
