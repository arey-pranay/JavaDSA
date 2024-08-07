#### 01. Reverse a linked list
- Three pointers, start from null - head - head.next     (prev, curr, fwd)
- while(fwd != null) keep moving ahead and re-assigning nodes and links. At the end curr.next = prev;

#### 02. Middle of a linked list
- Tortoise Hare approach
- Whenever fast == null or fast.next == null, return slow. Otherwise move by 2 and move slow by 1 for every iteration.
