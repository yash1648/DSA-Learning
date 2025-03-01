# 🔄 Queue Data Structure Workflow

## 📚 Introduction
A queue is a linear data structure that follows the First-In-First-Out (FIFO) principle. Elements are added at the rear (enQueue) and removed from the front (deQueue). It's like a line of people waiting - the first person to join the line is the first to leave.

## ⚙️ Core Operations

```
1. enQueue - Adds an element to the rear of the queue
2. deQueue - Removes and returns the element from the front of the queue
3. isEmpty - Checks if the queue is empty
4. isFull - Checks if the queue is full (for array implementations)
5. peek/front - Views the element at the front without removing it
```

## 🔄 Workflow Diagram

```
QUEUE OPERATIONS:

1. ENQUEUE Operation
   [Empty]                  enQueue(5)                    [5]
   front=-1, rear=-1  ----------------------->  front=0, rear=0
   
                           enQueue(10)                  [5][10]
                     ----------------------->  front=0, rear=1
   
                           enQueue(15)               [5][10][15]
                     ----------------------->  front=0, rear=2

2. DEQUEUE Operation
   [5][10][15]                deQueue()               [X][10][15]
   front=0, rear=2  ----------------------->  front=1, rear=2
   
                              deQueue()               [X][X][15]
                     ----------------------->  front=2, rear=2
   
                              deQueue()                 [Empty]
                     ----------------------->  front=-1, rear=-1
```

## 💻 Code Analysis

```java
public class Queue {
    int queue[] = new int[5];
    int front = -1, rear = -1;
    private boolean isFull() {
        return rear == queue.length - 1;
    }
    private boolean isEmpty() {
        return front == -1 || front > rear;
    }
    public void enQueue(int data) {
        if (isFull()) {
            System.out.println("Queue is full");
            return;
        }
        if (isEmpty()) {
            front = 0;
        }
        queue[++rear] = data;
    }
    public int deQueue() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        int data = queue[front++];
        // Reset queue when empty
        if (front > rear) {
            front = rear = -1;
        }
        return data;
    }
    public void show() {
        if (isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        for (int i = front; i <= rear; i++) {
            System.out.print(queue[i] + " ");
        }
        System.out.println();
    }
}
```

### 🧐 Key Points About This Implementation:

1. 📦 The queue is implemented using a fixed array of size 5
2. 🏁 Both `front` and `rear` are initialized to -1 to indicate an empty queue
3. ⬅️ `enQueue()` increments `rear` and adds an element, setting `front` to 0 if queue was empty
4. ➡️ `deQueue()` returns the element at `front` and increments `front`
5. 🔄 The implementation resets pointers when queue becomes empty after deQueue
6. ⚠️ This is a simple queue with potential wastage of space after deQueue operations
7. 🔍 `show()` displays all elements from front to rear
8. ❗ Note that this implementation has a limitation: it cannot reuse space after deQueue

## ⏱️ Time and Space Complexity

### Time Complexity
- **enQueue**: O(1) - Constant time to add an element to the rear 🚀
- **deQueue**: O(1) - Constant time to remove an element from the front 🚀
- **isEmpty/isFull**: O(1) - Constant time to check status 🚀
- **show**: O(n) - Linear time to display all elements 🏃

### Space Complexity
- O(n) - Where n is the fixed size of the queue array 🧠

## ✅ Advantages and Disadvantages

### Advantages
- ⚡ Fast operations - All primary operations are O(1)
- 🔄 Simple implementation of FIFO principle
- 📊 Good for order processing and sequential operations

### Disadvantages
- 📏 Fixed size in array implementation
- 🚫 Cannot utilize free spaces after deQueue (in this simple implementation)
- 📉 Potential for overflow despite having free spaces
- 🔍 Limited functionality compared to more advanced queue variants

## 🎯 Use Cases
- 🖨️ Print job scheduling
- 🔄 Process scheduling in operating systems
- 🌐 Request queuing in web servers
- 📱 Message queues in communication systems
- 🧮 Breadth-First Search algorithms
- 🚦 Traffic management systems
- 📊 Any scenario requiring first-come, first-served processing
