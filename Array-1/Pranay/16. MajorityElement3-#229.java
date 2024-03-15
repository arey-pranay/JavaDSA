class Solution {
    public List<Integer> majorityElement(int[] nums) {
        List<Integer> answer = new ArrayList<>();
        HashMap<Integer, Integer> h = new HashMap<>();
        int n = nums.length;
        for(int i=0;i<n;i++){
            if(h.containsKey(nums[i])){
                int a = h.get(nums[i]);
                h.put(nums[i] , a+1);
            } else {
                h.put(nums[i],1);
            } 
        }
        int nBy3 = n/3;
        //for traversing through the hashmap, we use an entryset
        for(Map.Entry<Integer, Integer> a : h.entrySet()) {
            Integer key = a.getKey();
            Integer value = a.getValue();
            if(value > nBy3){
            answer.add(key);
            }
        }
       
        return answer;
    }
}
