class MyQueue {

    Stack<Integer> s1;
    Stack<Integer> s2;

    public MyQueue() {
        s1 = new Stack<>();
        s2 = new Stack<>();
    }
    
    public void push(int x) {
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(x);
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    
    public int pop() {
        return s1.pop();
    }
    
    public int peek() {
        return s1.peek();
    }
    
    public boolean empty() {
        return s1.isEmpty();
    }
}

/**
 * Your MyQueue object will be instantiated and called as such:
 * MyQueue obj = new MyQueue();
 * obj.push(x);
 * int param_2 = obj.pop();
 * int param_3 = obj.peek();
 * boolean param_4 = obj.empty();
 */

// class MyQueue {
//     Stack<Integer> st = new Stack<>();
//     Stack<Integer> val = new Stack<>();

//     public MyQueue() {
        
//     }
    
//     public void push(int x) {
//         if(st.size()==0 && st.size()==0){
//             st.push(x);
//         }else{
//             if(val.size()!=0) val.push(x);
//             else st.push(x);
//         }
//     }
    
//     public int pop() {
//         if(st.size()!=0){
//             while(st.size()>1){
//                 val.push(st.pop());
//             }
//             int a = st.pop();

//             while(val.size()>0){
//                 st.push(val.pop());
//             }
//             return a;
//         }else{
//             while(val.size()>1){
//                 st.push(val.pop());
//             }
//             int a = val.pop();

//             while(st.size()>0){
//                 val.push(st.pop());
//             }
//             return a;
//         }
//     }
    
//     public int peek() {
//         if(st.size()!=0){
//             while(st.size()>1){
//                 val.push(st.pop());
//             }
//             int a = st.peek();

//             while(val.size()>0){
//                 st.push(val.pop());
//             }
//             return a;
//         }else{
//             while(val.size()>1){
//                 st.push(val.pop());
//             }
//             int a = val.peek();

//             while(st.size()>0){
//                 val.push(st.pop());
//             }
//             return a;
//         }
//     }
    
//     public boolean empty() {
//         if(st.size()==0 && val.size()==0) return true;
//         else return false;
//     }
// }

// /**
//  * Your MyQueue object will be instantiated and called as such:
//  * MyQueue obj = new MyQueue();
//  * obj.push(x);
//  * int param_2 = obj.pop();
//  * int param_3 = obj.peek();
//  * boolean param_4 = obj.empty();
//  */
