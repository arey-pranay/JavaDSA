#### 1. Set Matrix Zero

  - M rows and N columns. Create 2 boolean arrays, rows and cols, do full traversal and when matrix[i][j]=0, put rows[i]=true nd cols[j]=true;
  - for(i=0 to m){ if(rows[i]==true){ for(j=0 to n) matrix[i][j]=0}} . And a similar loop for j also

#### 2. Pascal's Triangle

#### 3. Next Permutation
  - Aakhri se pairs uthaane hai aur agr left more than right hai, to i-- krte rho, kyuki mtlb ye to khrb hi hai, to dekte hai sahi kahan pr tha. That "i" is the breaking point.
  - Start from end again, and then find the first element greater than i, that index is j. Swap i and j. Reverse after i+1.

#### 4. Maximum Subarray Sum
  - Initialize sum and max with 0th element. From first element just keep checking when sum<0, make sum =0.
  - And at every iteration, sum += nums[i] and then update max. And then finally return the max number.
