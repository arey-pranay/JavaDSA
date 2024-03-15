class Solution {
    public int uniquePaths(int m, int n) {
        long ans = 1;
        for(int i = m+n-2, j = 1; i >= max(m, n); i--, j++) 
            ans = (ans * i) / j;
        return ans;
    }
}
// in total you have to take n-1 rights and m-1 down
//     so total steps will n-1+m-1 equal to n+m -2 
//     we can use NCr to know the combination of D and R moves in an N sized combination
