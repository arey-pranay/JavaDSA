import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class Solution {
    public boolean canFinish(int numCourses, int[][] prerequisites) {
        // Initialize the adjacency list
        List<List<Integer>> adjList = new ArrayList<>();
        for (int i = 0; i < numCourses; i++) {
            adjList.add(new ArrayList<Integer>());
        }
        
        // Fill the adjacency list
        for (int[] pair : prerequisites) {
            int dest = pair[0];
            int src = pair[1];
            adjList.get(src).add(dest);
        }

        // Create an array to count the in-degrees
        int[] inDegrees = new int[numCourses];
        for (int i = 0; i < numCourses; i++) {
            for (int neighbor : adjList.get(i)) {
                inDegrees[neighbor]++;
            }
        }

        // Initialize the queue with nodes having zero in-degree
        Queue<Integer> q = new LinkedList<>();
        for (int i = 0; i < numCourses; i++) {
            if (inDegrees[i] == 0) {
                q.add(i);
            }
        }

        // List to store the topological order
        List<Integer> topologicalOrder = new ArrayList<>();
        
        // Process nodes with zero in-degree
        int visitedCount = 0;
        while (!q.isEmpty()) {
            int curr = q.remove();
            topologicalOrder.add(curr);
            visitedCount++;
            
            // Decrease the in-degree of neighboring nodes
            for (int neighbor : adjList.get(curr)) {
                inDegrees[neighbor]--;
                // If in-degree becomes zero, add it to the queue
                if (inDegrees[neighbor] == 0) {
                    q.add(neighbor);
                }
            }
        }

        // If we visited all courses, return true and print the topological order
        if (visitedCount == numCourses) {
            System.out.println("Topological Order: " + topologicalOrder);
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int numCourses = 4;
        int[][] prerequisites = {{1, 0}, {2, 0}, {3, 1}, {3, 2}};
        boolean canFinish = sol.canFinish(numCourses, prerequisites);
        System.out.println("Can finish all courses: " + canFinish);  // Output: true
    }
}
 
