class MinStack {
// use 2 stacks
// for pushing, push in s1. if s2 is empty push in it, else push in s2 only if the value is smaller that s2.peek() (the current min element)
// for popping, pop from s1. Pop from s2 only if the popped element was the min element.
// top is s1.peek() and getMin is s2.peek()
    Stack<Integer> s1 = new Stack<>();
    Stack<Integer> s2 = new Stack<>();
    public MinStack() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int val) {
        s1.push(val);
        if(s2.empty()) s2.push(val);
        else if(s2.peek()>=val) s2.push(val);
    }
    
    public void pop() {
        int popped = s1.pop();
        if (!s2.empty() && s2.peek() == popped) {
            s2.pop();
        }
    }

    public int top() {
        return s1.peek();
    }
    
    public int getMin() {
        return s2.peek();
    }
}
