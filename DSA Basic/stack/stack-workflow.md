# 📚 Stack Data Structure Workflow

## 📚 Introduction
A stack is a linear data structure that follows the Last-In-First-Out (LIFO) principle. Elements are added and removed from the same end, called the "top" of the stack. It's like a stack of plates - you can only add or remove plates from the top.

## ⚙️ Core Operations

```
1. push - Adds an element to the top of the stack
2. pop - Removes and returns the top element from the stack
3. peek - Returns the top element without removing it
4. isEmpty - Checks if the stack is empty
5. isFull - Checks if the stack is full (for array implementations)
```

## 🔄 Workflow Diagram

```
STACK OPERATIONS:

1. PUSH Operation
   [Empty]         push(5)       [5]      push(10)      [10]
     TOP=-1  ------------->  TOP=0  ------------->     [5]
                                                      TOP=1

2. POP Operation
     [10]          pop()        [5]       pop()      [Empty]
     [5]     ------------->   TOP=0  ------------->  TOP=-1
    TOP=1

3. PEEK Operation
     [10]          peek()       [10]      
     [5]     ------------->     [5]      (Returns 10 without removing it)
    TOP=1                      TOP=1     
```

## 💻 Code Analysis

```java
public class Stack {
    private int stack[];
    private int top = -1;
    public Stack() {
    }
    public Stack(int size) {
        stack = new int[size];
    }
    private boolean isFull() {
        return top == stack.length - 1;
    }
    private boolean isEmpty() {
        return top < 0;
    }
    public void push(int data) {
        if (isFull())
            System.out.println("Stack is overflow");
        else {
            stack[++top] = data;
            System.out.println(data + " is pushed");
        }
    }
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is underflow");
            return -1;
        } else {
            return stack[top--];
        }
    }
    public int peek() {
        if (isEmpty()) {
            return -1;
        } else
            return stack[top];
    }
    public void show() {
        if (isEmpty())
            System.out.println("Stack is underflow");
        else {
            int temp = top;
            while (temp >= 0 && temp < stack.length) {
                System.out.println(stack[temp]);
                temp--;
            }
        }
    }
}
```

### 🧐 Key Points About This Implementation:

1. 📦 The stack is implemented using an array of integers
2. 🏁 The `top` variable keeps track of the current top element index (initialized to -1 for empty stack)
3. ✅ Two constructors - default and with specified size
4. 🔒 Helper methods `isFull()` and `isEmpty()` are private, as they're only used internally
5. ⬆️ `push()` increments `top` before adding the element, returning overflow message if stack is full
6. ⬇️ `pop()` returns and then decrements `top`, returning underflow message if stack is empty
7. 👀 `peek()` returns the top element without modifying the stack
8. 🔍 `show()` displays all elements from top to bottom

## ⏱️ Time and Space Complexity

### Time Complexity
- **push**: O(1) - Constant time to add an element to the top 🚀
- **pop**: O(1) - Constant time to remove an element from the top 🚀
- **peek**: O(1) - Constant time to view the top element 🚀
- **isEmpty/isFull**: O(1) - Constant time to check status 🚀
- **show**: O(n) - Linear time to display all elements 🏃

### Space Complexity
- O(n) - Where n is the size of the stack defined at initialization 🧠

## ✅ Advantages and Disadvantages

### Advantages
- ⚡ Fast operations - All primary operations are O(1)
- 🔄 Simple implementation and intuitive behavior
- 🔍 Efficient memory utilization with array implementation
- 🧮 Useful for tracking state and organizing data

### Disadvantages
- 📏 Fixed size when implemented with arrays
- ❌ No random access to elements
- 🚫 Can only access the top element
- 📊 Potential for overflow/underflow conditions

## 🎯 Use Cases
- 🔄 Function call stack in programming languages
- ⏪ Implementing undo mechanisms in applications
- 📊 Expression evaluation and conversion (infix to postfix)
- 🧮 Backtracking algorithms
- 🧩 Balancing of symbols in compilers
- 🏗️ Memory management
