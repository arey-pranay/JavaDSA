#### 01. Reverse a linked list
- Three pointers, start from null - head - head.next     (prev, curr, fwd)
- while(fwd != null) keep moving ahead and re-assigning nodes and links. At the end curr.next = prev;

#### 02. Middle of a linked list
- Tortoise Hare approach
- Whenever fast == null or fast.next == null, return slow. Otherwise move by 2 and move slow by 1 for every iteration.

#### 03. Merge Two Sorted Linked Lists
- Put a dummy pointer null and a temp pointer. Initially compare list1 and list2 and assign temp to smaller. Increment list1 or list2. Then dummy.next = temp;
- while both are not null, compare assign and increment the smaller of list1 and list2. then do this while list!=null then while list2!=null. return dummy.next

#### 04. Remove nth node from the last/end
- Calculate total, run a loop for i = 1 to total-n, curr = curr.next Then just do curr.next = curr.next.next and then return head.
- Edge case is that if n == total then you can simply return head.next

#### 05. Add two numbers 🤯
- Do not add full numbers, add node by node. Maintain a head and a tail for answer linkedlist.
- Add sum, and create new node and adjust carry too. At the end just check if there is still carry remaining in the variable.

#### 06. Delete a given node
- node.val = node.next.val;
- node.next = node.next.next;

#### 07. Find Interesection of 2 linked lists
  - calculate count1 and count2. if c1>c2 headA = headA.next till false, and vice versa for c2>c1
  - while(headA != headB) headA= headA.next; headB = headB.next;     Then when loop breaks, return headA or headB

#### 08. Cycle Detection
  - Fast and Slow pointer, while(fast!=null && fast.next!=null) move fast by two, move slow by one, if they are equal return true.
  - After the while loop ends, return false.

#### 09. Reverse K Nodes 😐
  - Refer the code please
  - Iterative and Recursive Solutions are there. Both beat 100% codes.

#### 10. Check Palindrome
  - Calculate size, Reverse a half of linked list.
  - Compare the head original linked list with head of reversed half, if not matched then return false. Otherwise keep going forward by one till list ends, then return true.

#### 11. Linked List Cycle - II (Finf the start of cycle)
  - Fast and Slow Pointers. while fast!=null && fast.next!=null. if fast==slow. while fast!=slow
  - Return fast after the inner while. Return null after the outer while.
