class Solution {
    public List<List<Integer>> generate(int numRows) {
        int max = 1;
        int i=0;
        List<List<Integer>> Pascal = new ArrayList<>();
        while(i<numRows){
            List<Integer> subList = new ArrayList<>();
            int j=0;
            while(j<max-1){
                if(j==0){
                    subList.add(1);
                    j++;
                }
                else{
                    int prev = Pascal.get(i-1).get(j-1);
                    int next = Pascal.get(i-1).get(j);
                    int sum = prev+next;
                    subList.add(sum);
                    j++;
                }
            }
            subList.add(1);
            Pascal.add(subList);
            i++;  
            max++; 
        }
        return Pascal;
    }
}
