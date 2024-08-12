#### 01. Inorder Traversal
-  left, root, right.
-  pass an arraylist in it.

#### 02. Preorder Traversal
-  root, left, right.
-  pass an arraylist in it.

#### 03. Postorder Traversal
-  left, right, root.
-  pass an arraylist in it.

#### 04. Morris Inorder
-  curr, prev needed. while(curr!=null){ if(no_lc) add and curr.right }
-  else { prev = curr.left, while(prev.right!=null and prev.right!=curr) go right
-  if (right null) make thread and go left
-  else remove thread and add and go right

#### 05. Morris Preorder
- make thread and add and go left
- else remove thread and go right

#### 05.5 Morris Postorder
- change right to left
- change left to right

#### 06. Left View
-  Create a queue to keep track of each level. Add the root to the queue Level Order Traversal with while(!q.isEmpty()) int sz = q.size()
-  for(int i=0 to sz) remove from queue, if i=1 add to arr, check and add left child to queue , check and add right child to queue

#### 06.5 Right View
  - Just like Left view, but instead of first of every level, you eed to add the last of every level.
  - if(i==sz-1) arr.add(temp.val)

#### 07. Bottom View
-  TreeMap <Col , Node.data> , Queue<Pair> , Pair{node n , int col}. Do level order traversal but this time queue has Pair structure. And hashmap updates the value of col everytime. (TreeMap for maintaining the left totright values in column to value).
-  Pair temp = q.remove(); Node tempNode = temp.n; if(tempNode.left!=null) q.add(new Pair(tempNode.left, temp.col-1)) and temp.col+1 for the right child.

#### 08. Top View
-  Just like bottom view, but add for a column only when you get the first element of that col, so in the for loop, before adding to the treemap
-  int found = hm.getorDefault(temp.col,-1) if(found==-1) hm.add(temp.col,tempNode.data) //or temp.n.data
