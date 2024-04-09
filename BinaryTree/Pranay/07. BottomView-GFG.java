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
