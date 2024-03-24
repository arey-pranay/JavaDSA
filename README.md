# Java DSA
*https://www.youtube.com/playlist?list=PLfqMhTWNBTe3LtFWcvwpqTkUSlB32kJop*
## Basics

#### Java Objects are by default null-initialized. C++ has garbage-values.

- Eg: strings are initialized with "", objects with null, int with 0, float with 0.0, boolean with false.

#### Datatypes: Size : Range (64 bits system size)

- Primitive
  - byte: 1 byte : -128 to 127
  - short: 2 bytes : -32K to 32K
  - char: 2 bytes : a, b, c .. A, B, C .. @, #, $ ..
  - boolean: 1 byte : True, False
  - int: 4 bytes : -2B to 2B
  - long: 8 bytes : -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
  - float: 4 bytes : Upto 7 decimal digits
  - double: 8 bytes : Upto 16 decimal digits
- Non-Primitive

#### Arithmetics

- The precedence of M and D is same, while that of A and S is same.
- In case of conflicts, Follow L to R precedence. Except R to L for exponents.

#### Enhanced For Loop

```
for(data-type variable : array | collection)
  {
   // Code to be executed
  }
```

- Printing a 2D-Array/Matrices/ AnyCollection
  ```
  int[ ][ ] x={{1,2,3},{4,5,6}} ;
  for(int[ ] x1 :x){
    for(int x2 : x1) {
      System.out.println(x2);
    }
  }
  ```

#### Patterns

#### Functions

#### Wrapper Classes

#### Type Conversions

## 1-D Arrays

- Empty array declaration: type[ ] name = new type[size]
- Custom array declaration: type[ ] name = {a,b,c,d}
- Finding size: name.length;

## 2-D Arrays

- Empty array declaration: type[ ][ ] name = new type[rows][columns]

## Strings
- They are immutable as a datatype.
- If you want to input a word in a String, you use `.next()` and it just takes whatever is there before the first space.
- If you want to take an entire line, you use `.nextLine()` for that purpose.
- **Some Important Functions**
  - Concatenation: `String fullName = firstName + lastName;`
  - Number of chars: `fullName.length();`
  - Getting a char: `fullName.charAt(index);`
  - Comparing 2 strings: `a.compareTo(b)`
    - It returns a positive integer if `a > b`, 0 if `a` is the same as `b`, a negative integer if `a < b` (According to ASCII values)
    - Problem with `==` is that Strings are objects and you can't always compare 2 strings if you want to compare values only
  - Getting a Substring: `a.substring(start, end)` so it will return characters from index `start` to `end-1`. And if only 1 index is passed then it is considered the start index.

## StringBuilder
 - Modifying simple strings take up a lot of time.
 - Here you can also
     - Modify an old string: `a.setCharAt(index,char)`
     - Inserting a char in string: `a.insert(index,char)`
     - Deleting char: `a.delete(start,end)` deletes from start to end-1 index.
     - Append another string: `a.append(b)` (It takes much less time than string concatenation)
     - Getting the size of strinf: `a.length()` (Same as the String function..)

## Bit Manipulation
  - Bit Shifting
      - Left Shift: N << i, Shift N left by i places
      - Right Shift: N>>i, Shift N right by i places
      - 
## Linked List
  - Variable Size, Non Contiguous Locations
  - Time Complexities
    - Insert: `O(1)`
    - Retrieve: `O(n)`
    - This is the opposite of ArrayList
    - That is why it is used when a lot of modifications are needed.
  - Made up of Nodes. Each node has a `data` and a reference (pointer) to the `next` node.
  - The first Node is called "Head"

## Greedy Algorithms

- Greedy algorithms make locally optimal choices at each step with the hope of finding a global optimum.
- They are efficient and easy to implement but may not always provide the best solution.
- Examples:
  - **Dijkstra's Algorithm**: Finds the shortest path from a single source to all other nodes in a graph with non-negative edge weights.
  - **Kruskal's Algorithm**: Finds a minimum spanning tree for a connected weighted graph.
  - **Prim's Algorithm**: Another algorithm to find a minimum spanning tree in a graph.
  - **Fractional Knapsack**: A variant of the knapsack problem where items can be broken into fractions.
  - **Activity Selection**: Selects the maximum number of activities that can be performed by a single person, assuming that a person can only work on one activity at a time.
 
  
## Stack

- **Definition**: A stack is a linear data structure that follows the Last In, First Out (LIFO) principle. It means that the element added last to the stack will be the first one to be removed.
- **Operations**:
  - `push`: Adds an item to the top of the stack.
  - `pop`: Removes and returns the top item from the stack.
  - `peek` (or `top`): Returns the top item from the stack without removing it.
  - `isEmpty`: Checks if the stack is empty.
- **Applications**:
  - Function call stack in programming languages.
  - Implementing undo functionality in text editors.
  - Syntax parsing in compilers.
## Queue
  - The offer method inserts an element if possible, otherwise returning false. This differs from the Collection.add method, which can fail to add an element only by throwing an unchecked exception. The offer method is designed for use when failure is a normal, rather than exceptional occurrence, for example, in fixed-capacity (or "bounded") queues.

  - The remove() and poll() methods remove and return the head of the queue. Exactly which element is removed from the queue is a function of the queue's ordering policy, which differs from implementation to implementation. The remove() and poll() methods differ only in their behavior when the queue is empty: the remove() method throws an exception, while the poll() method returns null.

  - The element() and peek() methods return, but do not remove, the head of the queue.

## Tree

- **Definition**: A tree is a hierarchical data structure consisting of nodes connected by edges. The topmost node is called the root. Each node can have zero or more children.
- **Types**:
  - Binary Tree: Each node has at most two children, referred to as the left child and the right child.
  - Binary Search Tree (BST): A binary tree in which the left child of a node contains only values less than the node's value, and the right child contains only values greater than the node's value.
- **Operations**:
  - Traversal (Inorder, Preorder, Postorder)
  - Insertion
  - Deletion
- **Applications**:
  - Organizational charts
  - File systems
  - Expression evaluation

## Graphs
### Representations

#### Adjacency Matrix
- An adjacency matrix is a two-dimensional array where each cell `(i, j)` represents whether there is an edge from vertex `i` to vertex `j`.
- If the graph is weighted, the cell may contain the weight of the edge.
- **Advantages:**
  - Simple implementation for dense graphs.
  - Efficient for checking edge existence and determining neighbors.
- **Disadvantages:**
  - Requires `O(V^2)` space for `V` vertices, which can be inefficient for sparse graphs.
  - Inefficient for graphs with many vertices and few edges.

#### Adjacency List
- An adjacency list is a collection of lists or arrays where each list represents the neighbors of a vertex.
- For an unweighted graph, each list contains the vertices adjacent to the corresponding vertex.
- For a weighted graph, each list contains pairs `(v, w)` where `v` is the neighbor vertex and `w` is the weight of the edge.
- **Advantages:**
  - Efficient use of space for sparse graphs (`O(V + E)` where `V` is the number of vertices and `E` is the number of edges).
  - Efficient for iterating over edges and finding neighbors.
- **Disadvantages:**
  - Less efficient for dense graphs.
  - Requires more space per edge than an adjacency matrix.

### Traversals

#### Depth-First Search (DFS)
- DFS is a graph traversal algorithm that explores as far as possible along each branch before backtracking.
- It starts at a selected vertex and explores as far as possible along each branch before backtracking.
- Uses a stack or recursion to keep track of visited vertices.
- **Advantages:**
  - Simple implementation using recursion or a stack.
  - Suitable for finding paths, cycles, and connected components.
- **Disadvantages:**
  - May get stuck in infinite loops if not properly implemented or if the graph contains cycles.

#### Breadth-First Search (BFS)
- BFS is a graph traversal algorithm that explores all neighbor vertices at the current depth before moving to the next level.
- It starts at a selected vertex and explores all of its neighbors before moving to the next level of vertices.
- Uses a queue to keep track of visited vertices and their neighbors.
- **Advantages:**
  - Guarantees the shortest path from the source vertex to all other vertices in an unweighted graph.
  - Suitable for finding the shortest path, connected components, and level-based traversal.
- **Disadvantages:**
  - Requires more memory than DFS, especially for large graphs.
  - Less suitable for certain applications like topological sorting.

## Recursion

- **Definition**: Recursion is a programming technique where a function calls itself in its own definition. It breaks down a problem into smaller subproblems of the same type.
- **Base Case**: A condition that terminates the recursion by returning a value without further recursive calls.
- **Examples**:
  - Factorial function
  - Fibonacci sequence
  - Binary search
- **Pros**:
  - Simplifies code and logic for certain problems.
  - Elegant solution for problems that can be divided into subproblems.
- **Cons**:
  - May lead to stack overflow if not implemented correctly.
  - Some recursive algorithms can be less efficient than their iterative counterparts.

## Backtracking

- **Definition**: Backtracking is a systematic way to iterate through all possible solutions for a problem. It involves trying out different sequences of choices, backtracking when a dead end is reached, and continuing until the solution is found.
- **Components**:
  - **Decision Tree**: Represents all possible choices at each step of the algorithm.
  - **State Space Tree**: Represents the sequence of choices made during the exploration of the solution space.
- **Examples**:
  - N-Queens problem
  - Sudoku solving
  - Generating permutations or combinations
- **Strategies**:
  - Start with an empty solution and incrementally build it.
  - Use pruning techniques to avoid exploring unnecessary branches of the solution space.
- **Applications**:
  - Combinatorial optimization problems
  - Constraint satisfaction problems

