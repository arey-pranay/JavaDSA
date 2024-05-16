import java.util.Stack;

public class Solution {
    public int[] prevSmaller(int[] A) {
        int[] ans = new int[A.length];
        Stack<Integer> S1 = new Stack<>();
        
        for (int i = 0; i < A.length; i++) {
            // Pop elements from the stack that are greater than or equal to A[i]
            while (!S1.isEmpty() && S1.peek() >= A[i]) {
                S1.pop();
            }
            
            // If stack is not empty, the top element is the previous smaller element
            if (!S1.isEmpty()) {
                ans[i] = S1.peek();
            } else {
                // No previous smaller element
                ans[i] = -1;
            }
            
            // Push the current element onto the stack
            S1.push(A[i]);
        }
        
        return ans;
    }
}
