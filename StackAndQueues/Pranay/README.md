#### 01. Stack Using Array
  - push:   this.arr[++top] = x;
  - pop:    if(top<0) return -1; return this.arr[top--];

#### 02. Queue Using Array
  - push:  arr[rear++] = x;
  - pop:   if(front >= rear) return -1; return arr[front++];
