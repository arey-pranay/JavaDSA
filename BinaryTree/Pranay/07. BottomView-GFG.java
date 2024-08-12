class Solution
{
    class combo{
        Node x;
        int col;
        combo(Node x, int col){
            this.x = x;
            this.col = col;
        }
    }
    public ArrayList <Integer> bottomView(Node root)
    {
        // Code here
        TreeMap<Integer,Integer> h = new TreeMap<>();
        Queue<combo> q = new LinkedList<>();
        q.add(new combo(root,0));
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                combo temp = q.poll();
                h.put(temp.col,temp.x.data);
                if(temp.x.left!=null){
                    q.add(new combo(temp.x.left,temp.col-1));
                }
                if(temp.x.right!=null){
                    q.add(new combo(temp.x.right,temp.col+1));
                }
            }
            
        }
        //System.out.print(h);
        ArrayList<Integer> ans = new ArrayList<>();
        for(Map.Entry <Integer,Integer> entry: h.entrySet()){
            ans.add(entry.getValue());
        }
        return ans;
    }
}

// class Solution{
//     public ArrayList <Integer> bottomView(Node root){
//         ArrayList<Integer> arr = new ArrayList<>();
//         Queue<Pair> q = new LinkedList<>();
//         TreeMap<Integer, Integer> hm = new TreeMap<>(); // col : node
//         q.add(new Pair(root,0));
//         while(!q.isEmpty()){
//             int sz = q.size();
//             for(int i=0;i<sz;i++){
//                 Pair temp = q.remove();
//                 Node tempNode = temp.n;
//                 hm.put(temp.col,tempNode.data);
//                 if(tempNode.left!=null)q.add(new Pair(tempNode.left, temp.col-1));
//                 if(tempNode.right!=null)q.add(new Pair(tempNode.right,temp.col+1));
//             }
//         }
//         for(Map.Entry<Integer,Integer> e : hm.entrySet())  arr.add(e.getValue());
//         return arr;
//     }
//     class Pair{
//         Node n;
//         int col;
//         Pair(Node n, int col){
//             this.n = n;
//             this.col = col;
//         }
//     }
// }
