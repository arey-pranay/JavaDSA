class Solution {
    public int findDuplicate(int[] nums) {
        //create a boolean type array, to mark the visited numbers are visited
        boolean[]visited=new boolean[nums.length+1];
        for(int i=0;i<nums.length;i++){
            //if number is already marked visited, then return that number because it's repeated'
            if(visited[nums[i]]){
                return nums[i];
            }
            //and if it's not yet visited, mark it as visited
            else{
                visited[nums[i]]=true;                
            }
        }
        return -1;       
    }
}
