class Solution {
    //Moore Voting Algorithm
                //The algorithm works on the basis of the assumption that the majority element occurs more than n/2 times in the array. This assumption guarantees that even if the count is reset to 0 by other elements, the majority element will eventually regain the lead.                
                // Let's consider two cases:                
                // If the majority element has more than n/2 occurrences:                
                    // The algorithm will ensure that the count remains positive for the majority element throughout the traversal, guaranteeing that it will be selected as the final candidate.
                // If the majority element has exactly n/2 occurrences:                
                    // In this case, there will be an equal number of occurrences for the majority element and the remaining elements combined.
                    // However, the majority element will still be selected as the final candidate because it will always have a lead over any other element.
                // In both cases, the algorithm will correctly identify the majority element.
                
                // The time complexity of the Moore's Voting Algorithm is O(n) since it traverses the array once.
    public int majorityElement(int[] nums) {
        //the net frequency of the current element
        int count = 0;
        //the possible cadidate
        int candidate = 0;        
        for (int num : nums) {
            //whenever the count reaches 0, then try making some other num as your candiidate
            if (count == 0) {
                candidate = num;
            }    
            //if current number is same as candidate then increase the count
            if (num == candidate) {
                count++;
            } else {
                //otherwise decrease the count
                count--;
            }
        }        
        return candidate;
    }
}
//if an element occurs more  than floor value of n/2 times. Then if you sort the array, it will obviously occupy the n/2 index of the array..
// class Solution {
//     public int majorityElement(int[] nums) {
//         Arrays.sort(nums);
//         int n = nums.length;
//         return nums[n/2];
//     }
// }
// separate arrays for positive and negetive integers and use the mmappin ffrom value to index in new array to store the numberOfOccurences / freq of the given elements
// class Solution {
//     public int majorityElement(int[] nums) {
//         int n = nums.length;
//         int maxN = Arrays.stream(nums).max().getAsInt();
//         int minN = Math.abs(Arrays.stream(nums).min().getAsInt());
//         int[] arrP = new int[maxN+1];
//         int[] arrN = new int[minN+1];
//         for(int i=0;i<n;i++){
//            if(nums[i]<0){
//             arrN[Math.abs(nums[i])]++;
//             if(arrN[Math.abs(nums[i])]>Math.floor(n/2)) return nums[i];
//            } else{
//             arrP[nums[i]]++;
//             if(arrP[nums[i]]>Math.floor(n/2)) return nums[i];
//            } 
         
//         }
//         return 0;
//     }
// }
