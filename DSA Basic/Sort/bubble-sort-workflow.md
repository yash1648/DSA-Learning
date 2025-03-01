# 🫧 Bubble Sort Workflow

## 📚 Introduction
Bubble Sort is a simple comparison-based sorting algorithm that repeatedly steps through the list, compares adjacent elements, and swaps them if they are in the wrong order. The pass through the list is repeated until the list is sorted.

## ⚙️ Algorithm Workflow

```
1. Start from the first element (index 0)
2. Compare the current element with the next element
3. If the current element is greater than the next element, swap them
4. Move to the next pair of elements and repeat steps 2-3
5. After completing one full pass, the largest element will be at the end
6. Repeat steps 1-5 for n-1 passes, where n is the length of the array
7. After each pass, one more element gets fixed at the end
```

## 🔄 Workflow Diagram

```
START
  |
  v
Get array length n
  |
  v
For i = 0 to n-2
  |
  v
  For j = 0 to n-2-i
  |
  v
    Is a[j] > a[j+1]? --Yes--> Swap a[j] and a[j+1]
    |
   No
    |
    v
    Continue inner loop
  |
  v
  End inner loop
  |
  v
End outer loop
  |
  v
FINISH (Array is sorted)
```

## 💻 Code Analysis

```java
public void sort(int a[]) {
    int n = a.length;
    for (int i = 0; i < n - 1; i++) {
        for (int j = 0; j < n - 1 - i; j++) {
            if (a[j] > a[j + 1]) {
                SwapVar.swapArray(a, j, j + 1);
            }
        }
    }
}
```

The code uses two nested loops. The outer loop runs from 0 to n-2 (i = 0 to n-1-1), and for each iteration of the outer loop, the inner loop runs from 0 to n-2-i. This way, after each pass of the outer loop, the largest element "bubbles up" to its correct position at the end, and we don't need to check it again.

The SwapVar.swapArray() method is called to swap adjacent elements when they are in the wrong order.

## ⏱️ Time and Space Complexity

### Time Complexity
- **Best Case**: O(n) - When the array is already sorted (with optimization) 🚀
- **Average Case**: O(n²) - Typically requires n²/2 comparisons and swaps 🏃
- **Worst Case**: O(n²) - When the array is sorted in reverse order 🐢

### Space Complexity
- O(1) - Only requires a constant amount of additional space for the temporary variable used in swapping 🧠

## ✅ Advantages and Disadvantages

### Advantages
- ✨ Simple to understand and implement
- 🔄 In-place sorting (doesn't require extra space)
- 🧮 Stable sorting algorithm (maintains the relative order of equal elements)
- 🔍 Easy to detect if the array is already sorted

### Disadvantages
- 📏 Very inefficient for large arrays
- ⏰ Quadratic time complexity makes it impractical for real-world applications
- 🐌 Much slower than more advanced algorithms like QuickSort, MergeSort, or HeapSort

## 🎯 Use Cases
- 🧩 Educational purposes to understand sorting concepts
- 💯 Small datasets where simplicity is preferred over efficiency
- 🔍 When memory space is limited
- ✅ When a stable sort is required for a small dataset
