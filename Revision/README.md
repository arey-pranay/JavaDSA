## 01. Min Stack 
  - use 2 stacks.
  - top is s1.peek() and getMin is s2.peek()
  - for pushing, push in s1. if s2 is empty push in it, else push in s2 only if the value is smaller that s2.peek() (the current min element)
  - for popping, pop from s1. Pop from s2 only if the popped element was the min element.

## 02. Merge 2 Sorted Arrays
  - Start from last of both arrays, compare the values, and start putting the greater at the back of nums1.
  - int i = m-1, int j = n-1, int curr = m+n-1

## 03. Stock Buy and Sell (Single Buy and Single Sell)
  - Initially buy at prices[0] with initial profit = 0.
  - For every element. if(prices[i] < boughtAt) boughtAt = prices[i] , else you got a bigger than boughtAt val, so then try to update profit with max(profit, prices[i] - boughtAt)

## 04. Stock Buy and Sell (Multiple times sell and buy) (Still hold at most 1 stock at a time)
  - Initially same values.
  - If profit is there, then add this prof in the totalProfit. And anyway set the boughtAt = prices[i] at every iteration end
