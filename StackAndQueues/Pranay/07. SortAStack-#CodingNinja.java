import java.util.Stack;

public class Solution {

    public static void sortStack(Stack<Integer> stack) {
        if (is_empty(stack)) {
            return;
        }
        int popped = pop(stack);
        sortStack(stack);
        sortedInsert(stack, popped);
    }

    private static void sortedInsert(Stack<Integer> stack, int key) {
        if (is_empty(stack) || key > top(stack)) {
            push(stack, key);
            return;
        }

        int temp = pop(stack);
        sortedInsert(stack, key);
        push(stack, temp);
    }

    // Replace these functions with your actual implementations for stack operations
    public static boolean is_empty(Stack<Integer> stack) {
        return stack.isEmpty();
    }

    public static void push(Stack<Integer> stack, int value) {
        stack.push(value);
    }

    public static int pop(Stack<Integer> stack) {
        return stack.pop();
    }

    public static int top(Stack<Integer> stack) {
        return stack.peek();
    }

    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        stack.push(3);
        stack.push(-2);
        stack.push(9);
        stack.push(-7);
        stack.push(5);

        sortStack(stack);

        while (!is_empty(stack)) {
            System.out.print(pop(stack) + " ");
        }
    }
}
