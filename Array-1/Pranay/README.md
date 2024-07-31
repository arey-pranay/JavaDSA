#### 1. Set Matrix Zero
  - M rows and N columns. Create 2 boolean arrays, rows and cols, do full traversal and when matrix[i][j]=0, put rows[i]=true nd cols[j]=true;
  - for(i=0 to m){ if(rows[i]==true){ for(j=0 to n) matrix[i][j]=0}} . And a similar loop for j also

#### 2. Pascal's Triangle
  - Create a 2D Array, put 1st array as just [1], then for every index after 0, get the i-1th row.
  - Put the new row's element as prevRow.get(j) + prevRow.get(j-1) and at the end put a 1 after each array as the last element.

#### 3. Next Permutation
  - Aakhri se pairs uthaane hai aur agr left more than right hai, to i-- krte rho, kyuki mtlb ye to khrb hi hai, to dekte hai sahi kahan pr tha. That "i" is the breaking point.
  - Start from end again, and then find the first element greater than i, that index is j. Swap i and j. Reverse after i+1.

#### 4. Maximum Subarray Sum
  - Initialize sum and max with 0th element. From first element just keep checking when sum<0, make sum =0.
  - And at every iteration, sum += nums[i] and then update max. And then finally return the max number.

#### 5. Sort Colors
  - Count 0s, Count 1s while traversing. From 0 till numZeroes, put 0s, then till numOnes put 1s and then till the end of the array put 2s.
  - Count Sort, maybe this.

#### 6. Stock Buy Sell
  - Suppose you buy at 0th index with profit =0. for(int i=0 to prices.length) if(prices[i]<boughAt) then buy here, else check if profit should be updated here.
  - You can buy and sell only once.

#### 7. Rotate Matrix
  - Transpose the matrix along the diagonal (i = 0 to n and in that j = i to n, so that the already interchaged elements don't get interchanged again and again)
  - Reverse each row by swapping the i and length-1 element till half of the array only.

#### 8. Merge Intervals
  - Very imp to sort a 2D array         Arrays.sort(intervals, (i1, i2) -> Integer.compare(i1[0], i2[0]));
  - Must see the code. Please.

#### 9. Merge 2 sorted Arrays
  - Start from end and use 3 pointers. m-1,n-1,m+n-1.
  - Keep putting the greater element by comparing i and j, at the k position and decrement as required.

#### 10. Find Duplicate element 
  - Create n sized boolean array, and then in a forEach loop, just check if ans[i]==true, return ans[i].
  - Otherwise put that index as a true in the boolean answer array.

#### 11. Repeat and Missing Number
  - Create a boolean array, traverse the given array, whatever num you find, put that index true in boolean array.
  - If the index is already true, then it will be ans[0]. For ans[1], find the element in the boolean array which was false even after you traversed the first array completely (one more for loop after the old one).

#### 12. Count inversions
  - i to length-1, i+1 to length
  - if condition met (i.e., if (arr[i] < arr[j]) then do count++. At the end, just return the count.

#### 13. Search in 2D Matrix
  - Start from first row rightmost element. if found then return true.
  - if target is smaller j-- (search on the left), otherwise i++ (search below).

#### 14. Find the Power
  - Please Read the code
  - Binary representations are required in this code, bitwise math.

#### 15. Majority Element
  - Moore's Voting Algorithm. Candidate = nums[0], Count = 1; Return cadidate at the end;
  - if(nums[i]==candidate) count++; else count--. if(count==0)candidate=nums[i]; count=1;

#### 16. Majority Element (n/3)
  - Create a hashmap to map each number with its occurences, and then return whichever number has more than 3 occurences.          for(Map.Entry<Integer, Integer> e : hm.entrySet()){
  - There is also a modified version of Moore's Voting Algorithm for this one

#### 17. Unique Paths
  - Use recursion, then just memoize. The base case is that if any of m and n gets 1 then return 1.
  - Otherwise, just return func(m-1,n) + func(m,n-1).
