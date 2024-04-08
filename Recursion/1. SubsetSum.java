class Solution{
    public static void helper(ArrayList<Integer>list ,ArrayList<Integer> arr,int i, int sum,int N){
        if(i== N){
            list.add(sum);
            return;
        }
        helper(list,arr,i+1,sum+arr.get(i),N);
        helper(list,arr,i+1,sum,N);
    }
    ArrayList<Integer> subsetSums(ArrayList<Integer> arr, int N){
        // code here
        ArrayList<Integer> list = new ArrayList<>();
        helper(list,arr,0,0,N);
        return list;
    }
}
