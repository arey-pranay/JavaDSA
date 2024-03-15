class Solution {
    int count;
    public int reversePairs(int[] nums) {
        count = 0;
        merger(nums,0,nums.length-1);

        return count;
    }
    private ArrayList<Integer> merge(ArrayList<Integer> left,ArrayList<Integer> right){
        ArrayList<Integer> ans = new ArrayList<>();
        int i = 0;
        int j = 0;
        while(i < left.size() && j < right.size()){
            if (left.get(i) >right.get(j)){
                ans.add(right.get(j));
                j++;
            }
            else {
                ans.add(left.get(i));
                i++;
            }
           /* else if(left.get(i) == right.get(j)){
                ans.add(left.get(i));
                ans.add(right.get(j));
                i++;
                j++;
            }*/
        }
        if ( i < left.size()){
            while (i <left.size())
             ans.add(left.get(i++));
        }
        if(j < right.size()){
            while (j < right.size())
             ans.add(right.get(j++));
        }
        return ans;
    }
    private void helper(ArrayList<Integer> left,ArrayList<Integer> right){
        int i = 0;
        int j = 0;
        while (i < left.size() && j < right.size()){
            if(left.get(i) > 2*(long)right.get(j)){
                count += left.size() - i;
                j++;
            }
            else
            i++;
        }
        
    }
    private ArrayList<Integer> merger(int[] nums,int start,int end){
        if(start == end){
            ArrayList<Integer> temp = new ArrayList<>();
            temp.add(nums[start]);
            return temp;
        }
        int mid = (start + end)/2;
        
        ArrayList<Integer> left = merger(nums,start,mid);
        ArrayList<Integer> right = merger(nums,mid+1,end);
        helper(left,right);
        
        return merge(left,right);

    }
}
