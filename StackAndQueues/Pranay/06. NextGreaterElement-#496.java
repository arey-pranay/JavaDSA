// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         Map<Integer,Integer> map=new HashMap<>();
//         Stack<Integer> stack=new Stack<>();

//         if(nums1.length==0 || nums2.length==0)
//             return new int[0];

//         for(int i=nums2.length-1;i>=0;i--){
            
//             if(!stack.isEmpty() ){
//                 while(!stack.isEmpty() && stack.peek()<=nums2[i]){
//                     stack.pop();
//                 }
//             }
            
//             if(stack.isEmpty()){
//                map.put(nums2[i],-1);
//             }else{
//                map.put(nums2[i],stack.peek());
//             }

//             stack.push(nums2[i]);
//         }

//         for(int j=0;j<nums1.length;j++){
//             nums1[j]=map.get(nums1[j]);
//         }

//         return nums1;
//     }
// }
// class Solution {
//     public int[] nextGreaterElement(int[] nums1, int[] nums2) {
//         Stack<Integer> st1 = new Stack<>();
//         Stack<Integer> st2 = new Stack<>();
//         int[] ans = new int[nums1.length];
//         for(int i: nums2) st1.push(i);
//         Arrays.fill(ans,-1);
//         // int index = 0;
//         int curr = 0;
//         for(int i : nums1){
//             while(true){
//                 int temp = st1.pop();
//                 st2.push(temp);
                // if(temp==i){
                //     curr++;
                //     break;
                // }
//                 if(temp >i){
//                     ans[curr] = temp;
//                 }
//             }
//             while(!st2.isEmpty()){
//                 st1.push(st2.pop());
//             }
//         }
//         return ans;
//     }
// }
class Solution {
    public int[] nextGreaterElement(int[] nums1, int[] nums2) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        for(int i=0; i<nums2.length; i++){
            hm.put(nums2[i],i);
        }
        int ans [] = new int[nums1.length];
        Arrays.fill(ans,-1);

        for(int i=0; i<nums1.length; i++){
            if(hm.containsKey(nums1[i])){
                for(int j=hm.get(nums1[i])+1; j<nums2.length; j++){
                    if(nums2[j]>nums1[i]){
                        ans[i]=nums2[j];
                        break;
                    }
                }
            }
        }

        return ans;
    }
}
