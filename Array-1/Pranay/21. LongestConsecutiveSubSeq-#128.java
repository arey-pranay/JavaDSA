//most optimal
class Solution {
    public int longestConsecutive(int[] nums) {int result = 0;
        if (nums.length > 0) {
            if (nums.length < 1000) {
                Arrays.sort(nums);
                int current = 0;
                for (int i = 1; i < nums.length; i++) {
                    if (nums[i] != nums[i - 1]) {
                        if (nums[i] - nums[i - 1] == 1) {
                            current++;
                        } else {
                            if (current + 1 > result) {
                                result = current + 1;
                            }
                            current = 0;
                        }
                    }
                }
                if (current + 1 > result) {
                    result = current + 1;
                }
            } else {
                int min = Integer.MAX_VALUE;
                int max = Integer.MIN_VALUE;
                for (int num : nums) {
                    if (num > max) {
                        max = num;
                    }
                    if (num < min) {
                        min = num;
                    }
                }
                byte[] bits = new byte[max - min + 1];
                for (int num : nums) {
                    bits[num - min] = 1;
                }
                int current = 0;
                for (byte bit : bits) {
                    if (bit > 0) {
                        current++;
                    } else {
                        if (current > result) {
                            result = current;
                        }
                        current = 0;
                    }
                }
                if (current > result) {
                    result = current;
                }
            }
        }
        return result;
    }
}
// //order of N
// public class Solution {
//     public static int longestConsecutive(int[] a) {
//         int n = a.length;
//         if (n == 0)
//             return 0;

//         int longest = 1;
//         Set<Integer> set = new HashSet<>();

//         // put all the array elements into set
//         for (int i = 0; i < n; i++) {
//             set.add(a[i]);
//         }

//         // Find the longest sequence
//         for (int it : set) {
//             // if 'it' is a starting number
//             if (!set.contains(it - 1)) {
//                 // find consecutive numbers
//                 int cnt = 1;
//                 int x = it;
//                 while (set.contains(x + 1)) {
//                     x = x + 1;
//                     cnt = cnt + 1;
//                 }
//                 longest = Math.max(longest, cnt);
//             }
//         }
//         return longest;
//     }
// }
