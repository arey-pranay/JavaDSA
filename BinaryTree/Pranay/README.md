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

#### 06 Morris Postorder
- change right to left
- change left to right
