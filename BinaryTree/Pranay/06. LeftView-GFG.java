// class Tree
// {
//     //Function to return list containing elements of left view of binary tree.
//     ArrayList<Integer> leftView(Node root)
//     {
//       ArrayList<Integer> result = new ArrayList<>();
//         if (root == null)
//             return result;

//         Queue<Node> queue = new LinkedList<>();
//         queue.add(root);

//         while (!queue.isEmpty()) {
//             int size = queue.size();
//             for (int i = 0; i < size; i++) {
//                 Node current = queue.poll();
//                 // For the leftmost element of each level, add it to the result
//                 if (i == 0)
//                     result.add(current.data);
//                 // Enqueue left and right children if they exist
//                 if (current.left != null)
//                     queue.add(current.left);
//                 if (current.right != null)
//                     queue.add(current.right);
//             }
//         }
//         return result;
//     }
// }

class Tree {
    ArrayList<Integer> leftView(Node root){
      ArrayList<Integer> arr = new ArrayList<>();
      Queue<Node> q = new LinkedList<>();
      q.add(root);
      while(!q.isEmpty()){
         int sz = q.size();
         for(int i=0;i<sz;i++){
             Node temp = q.remove();
             if(i==0) arr.add(temp.data); 
             if(temp.left!=null) q.add(temp.left);
             if(temp.right!=null) q.add(temp.right);
         }
      }
      return arr;
    }
}
