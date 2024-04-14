same as preOrder, exchange left and right and then reverse the answer..

  import java.util.*;
public class morrisPostOrder {
    static class Node {
        int data;
        Node left;
        Node right;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;
        }
    }

    public static List<Integer> morrisTraversal(Node root) {
        List<Integer> postorder = new ArrayList<>();
        Node curr = root;

        while (curr != null) {
            if (curr.right == null) {
                postorder.add(curr.data);
                curr = curr.left;
            } else {
                Node prev = curr.right;
                while (prev.left != null && prev.left != curr) {
                    prev = prev.left;
                }

                if (prev.left == null) {
                    prev.left = curr; // make thread
                    postorder.add(curr.data); // add to queue
                    curr = curr.right; // go to the left side
                } else { // already there is thread
                    prev.left = null; // remove thread
                    curr = curr.left; // go to the right side
                }
                
            }
        }
        Collections.reverse(postorder);
        return postorder;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);
        root.right.left = new Node(6);
        root.right.right = new Node(7);

        List<Integer> result = morrisTraversal(root);
        System.out.println(result); // Expected output: [1, 2, 4, 5, 3, 6, 7]
    }
}
