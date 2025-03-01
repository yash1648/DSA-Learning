# 🔍 Binary Search Workflow

## 📚 Introduction
Binary search is an efficient search algorithm that finds the position of a target value within a sorted array by repeatedly dividing the search interval in half. It works by comparing the target value to the middle element of the array and eliminating half of the remaining elements in each iteration.

## ⚙️ Algorithm Workflow

```
1. Sort the array if not already sorted
2. Set low = 0 and high = n-1 (where n is the array length)
3. While low <= high:
   a. Calculate mid = (low + high) / 2
   b. If target == array[mid], return mid
   c. If target < array[mid], update high = mid - 1
   d. If target > array[mid], update low = mid + 1
4. If target is not found, return -1
```

## 🔄 Workflow Diagram

```
START
  |
  v
Sort the array (BubbleSort)
  |
  v
Initialize variables:
resIdx = -1, low = 0, high = n-1
  |
  v
Is low <= high? --No--> Return resIdx
  |
 Yes
  |
  v
Calculate mid = (low + high) / 2
  |
  v
Is target == array[mid]? --Yes--> Return mid
  |
 No
  |
  v
Is target < array[mid]? --Yes--> high = mid - 1
  |                               |
 No                               v
  |                         Go back to "Is low <= high?"
  v
low = mid + 1
  |
  v
Go back to "Is low <= high?"
```

## 💻 Code Analysis

```java
public int search(int a[], int target) {
    int resIdx = -1; 
    bs = new BubbleSort();
    bs.sort(a);
    int n = a.length; 
    int low = 0; 
    int high = n - 1; 
    int mid = -1;
    for (int i = 0; i < n; i++) {
        if (low < high) {
            mid = (low + high) / 2;
            if (target < a[mid])
                high = mid - 1;
            else
                low = mid + 1;
            if (target == a[mid])
                return resIdx = mid;
        }
    }
    return resIdx;
}
```

### 🧐 Observations About the Implementation:
1. 🔄 The code uses a for-loop with a counter i that iterates from 0 to n-1
2. 🔍 The search condition uses `low < high` instead of including equality
3. 🔀 The order of operations: first updates low/high, then checks for equality
4. 🚦 The algorithm might exit early due to the for-loop iteration limit

## ⏱️ Time and Space Complexity

### Time Complexity
- **Sorting**: O(n²) if using bubble sort 🔄
- **Binary Search**:
  - Best Case: O(1) - The target is at the middle of the array 🚀
  - Average/Worst Case: O(log n) - The number of comparisons grows logarithmically with the array size ⚡

### Space Complexity
- O(1) - Only a constant amount of extra space is used regardless of input size 🧠

## ✅ Advantages and Disadvantages

### Advantages
- ⚡ Very efficient for large sorted arrays
- 📉 Logarithmic time complexity makes it much faster than linear search for large datasets
- 💾 Works well with arrays stored in memory
- 🔍 Significantly reduces the search space with each iteration

### Disadvantages
- 📋 Requires the array to be sorted first
- ⏳ Sorting may add significant overhead for one-time searches
- 🔄 Not suitable for lists that require frequent insertions/deletions
- 🧩 More complex to implement correctly than linear search

## 🎯 Use Cases
- 📚 Searching in large sorted arrays
- 🔁 Repeated searches in the same dataset (where sorting cost is amortized)
- ⚡ When efficiency is critical for large datasets
- 📖 Dictionary and phone book lookups
- 💽 Database indexing and retrieval
