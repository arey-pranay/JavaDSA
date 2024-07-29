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
