#### 01. Reverse a linked list
- Three pointers, start from null - head - head.next     (prev, curr, fwd)
- while(fwd != null) keep moving ahead and re-assigning nodes and links. At the end curr.next = prev;
