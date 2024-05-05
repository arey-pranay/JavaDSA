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
