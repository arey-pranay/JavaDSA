# Java DSA

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
- If you want to input a word in a String, you use .next() and it just takes whatever is there before the first " ".
- If you want to take an entire line, you use nextLine() for that purpose.
- Some Important Functions
    -- Concatenation: String FullName = firstName + lastName;
    -- Number of chars: FullName.length();
    -- Getting a char: FullName.charAt();
    -- Comparing 2 strings: a.compareTo(b)
      --- It returns a +ve int if a>b, 0 if a is same as b, a -ve int if a<b (According to ASCII values)
      --- Problem with "==" is that Strings are objects and you can't always compare 2 strings if you want to compare values only
    -- Getting a Substring: a.substring(start, end) so it will return start to end-1 indices. And if only 1 index is passed then it is considered the start index.
    
    
     
