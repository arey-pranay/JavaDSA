public class Solution {
    class Queue {
        int front, rear;
        int[] arr;

        Queue() {
            front = 0;
            rear = 0;
            arr = new int[100001];
        }

        // Enqueue (add) element 'e' at the end of the queue.
        public void enqueue(int e) {
            // Check if the queue is full
            if (rear == arr.length) {
                System.out.println("Queue is full. Cannot enqueue element.");
                return;
            }
            // Add element 'e' at the end of the queue
            arr[rear++] = e;
        }

        // Dequeue (retrieve) the element from the front of the queue.
        public int dequeue() {
            // Check if the queue is empty
            if (front == rear) {
                return -1; // Return a default value indicating failure
            }
            // Retrieve the element from the front of the queue
            int element = arr[front++];
            return element;
        }
    }
}
// class MyStack {
//     private int[] arr;
//     private int top;

//     public MyStack() {
//         arr = new int[1000];
//         top = -1;
//     }

//     public void push(int x) {
//         // Your Code
//         this.arr[++top] = x;
//     }

//     public int pop() {
//         // Your Code
//         if(top<0) return -1;
//         return this.arr[top--];
//     }
// }
