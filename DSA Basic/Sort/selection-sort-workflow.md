# 🔍 Selection Sort Workflow

## 📚 Introduction
Selection Sort is a simple comparison-based sorting algorithm. It works by repeatedly finding the minimum element from the unsorted part of the array and putting it at the beginning of the unsorted part.

## ⚙️ Algorithm Workflow

```
1. Divide the array into sorted and unsorted parts (initially, the sorted part is empty)
2. Find the minimum element in the unsorted part
3. Swap it with the first element of the unsorted part
4. Expand the sorted part to include this newly placed element
5. Repeat steps 2-4 until the entire array is sorted
```

## 🔄 Workflow Diagram

```
START
  |
  v
For i = 0 to array.length-2
  |
  v
  Set smallest = i
  |
  v
  For j = i+1 to array.length-1
  |
  v
    Is array[j] < array[smallest]? --Yes--> Set smallest = j
    |
   No
    |
    v
    Continue inner loop
  |
  v
  Swap array[i] and array[smallest]
  |
  v
End outer loop
  |
  v
FINISH (Array is sorted)
```

## 💻 Code Analysis

```java
public void sort(int arr[]) {
    for (int i = 0; i < arr.length - 1; i++) {
        int s = i;
        for (int j = i + 1; j < arr.length; j++) {
            if (arr[s] > arr[j])
                s = j;
        }
        SwapVar.swapArray(arr, s, i);
    }
}
```

The code uses two nested loops. The outer loop iterates through each position of the array (except the last one). For each position, the inner loop finds the index of the smallest element in the remaining unsorted part of the array. After finding the smallest element, it swaps it with the element at the current position, effectively extending the sorted portion of the array.

The variable `s` keeps track of the index of the smallest element found so far in the unsorted part.

## ⏱️ Time and Space Complexity

### Time Complexity
- **Best Case**: O(n²) - Even if the array is already sorted, we still need to scan the unsorted portion 🏃
- **Average Case**: O(n²) - Requires n²/2 comparisons and n swaps 🏃
- **Worst Case**: O(n²) - Same as the average case 🐢

### Space Complexity
- O(1) - Only requires a constant amount of additional space for the index variables 🧠

## ✅ Advantages and Disadvantages

### Advantages
- ✨ Simple to understand and implement
- 🔄 In-place sorting algorithm
- 📊 Performs well on small arrays
- ⬇️ Minimizes the number of swaps (n-1 swaps in the worst case)

### Disadvantages
- ⏰ Always has O(n²) time complexity, even in the best case
- 🐌 Inefficient for large arrays
- ❌ Not stable (can change the relative order of equal elements)

## 🎯 Use Cases
- 🧩 Small datasets where minimizing memory writes is important
- 💾 When memory write operations are significantly more expensive than read operations
- 🔍 Educational purposes to understand comparison-based sorting
- 💻 Systems with limited memory where simplicity is valued
