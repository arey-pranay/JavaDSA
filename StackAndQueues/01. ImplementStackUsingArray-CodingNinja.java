import java.util.*;

public class Solution {
    static class Stack {
        int[] arr;
        int n;

        Stack(int capacity) {
            this.arr = new int[capacity];
            Arrays.fill(arr, -1);
            this.n = 0;
        }

        public void push(int num) {
            if (n < arr.length)
                arr[n++] = num;
        }

        public int pop() {
            if (n > 0)
                return arr[--n];
            else
                return -1;
        }

        public int top() {
            if (n > 0)
                return arr[n - 1];
            else
                return -1;
        }

        public int isEmpty() {
            if (n == 0)
                return 1;
            else
                return 0;
        }

        public int isFull() {
            if (n == arr.length)
                return 1;
            else
                return 0;
        }
    }
}
