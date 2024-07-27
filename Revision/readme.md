# 01. Min Stack 
  - use 2 stacks.
  - top is s1.peek() and getMin is s2.peek()
  - for pushing, push in s1. if s2 is empty push in it, else push in s2 only if the value is smaller that s2.peek() (the current min element)
  - for popping, pop from s1. Pop from s2 only if the popped element was the min element.
