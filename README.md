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
## Queue
  - The offer method inserts an element if possible, otherwise returning false. This differs from the Collection.add method, which can fail to add an element only by throwing an unchecked exception. The offer method is designed for use when failure is a normal, rather than exceptional occurrence, for example, in fixed-capacity (or "bounded") queues.

  - The remove() and poll() methods remove and return the head of the queue. Exactly which element is removed from the queue is a function of the queue's ordering policy, which differs from implementation to implementation. The remove() and poll() methods differ only in their behavior when the queue is empty: the remove() method throws an exception, while the poll() method returns null.

  - The element() and peek() methods return, but do not remove, the head of the queue.


## Tree
## Recursion
## Graphs
## Backtracking
