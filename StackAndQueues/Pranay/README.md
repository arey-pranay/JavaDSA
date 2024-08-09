#### 01. Stack Using Array
  - push:   this.arr[++top] = x;
  - pop:    if(top<0) return -1; return this.arr[top--];

#### 02. Queue Using Array
  - push:  arr[rear++] = x;
  - pop:   if(front >= rear) return -1; return arr[front++];

#### 03. Stack Using Queues
  - push: while(!q1.isEmpty()){ q2.add(q1.remove()); } q1.add(x); while(!q2.isEmpty()){q1.add(q2.remove()); }
  - pop:  return q1.remove();  top: return q1.peek();  empty: return q1.isEmpty();

#### 04. Queue Using Stacks
  - push:  while(!s1.isEmpty()){s2.push(s1.pop());}s1.push(x); while(!s2.isEmpty()){ s1.push(s2.pop()); }
  - remove:   return  s1.pop();   peek: return s1.peek();  empty: return s1.isEmpty();

#### 05. Valid Parentheses
  - agr opening mila to uska corresponding closing stack me dalo
  - agr closing mila to stack ke top se compare krlo

#### 06. Next Greater Element
  - Three approaches
  - HashMap, Stack and HashMap, 2 Stacks
