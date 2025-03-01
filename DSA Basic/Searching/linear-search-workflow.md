# 🔍 Linear Search Workflow

## 📚 Introduction
Linear search (also called sequential search) is a simple search algorithm that finds the position of a target value within a list by checking each element sequentially until a match is found or the entire list has been searched.

## ⚙️ Algorithm Workflow

```
1. Start from the first element (index 0)
2. Compare the current element with the target value
3. If the current element matches the target, return the current index
4. If the current element does not match, move to the next element
5. Repeat steps 2-4 until a match is found or the end of the array is reached
6. If no match is found after checking all elements, return -1
```

## 🔄 Workflow Diagram

```
START
  |
  v
Initialize eleIdx = -1
  |
  v
Set i = 0
  |
  v
Is i < array.length? --No--> Return eleIdx
  |
 Yes
  |
  v
Is array[i] == target? --Yes--> Return i
  |
 No
  |
  v
Increment i
  |
  v
Go back to "Is i < array.length?"
```

## 💻 Code Analysis

```java
public int search(int a[], int target) {
    int eleIdx = -1;
    for (int i = 0; i < a.length; i++)
        if (a[i] == target)
            return i;
    return eleIdx;
}
```

The code initializes `eleIdx` to -1 as a default value indicating "not found." It then iterates through each element of the array, checking if the current element equals the target. If a match is found, it immediately returns the current index. If the loop completes without finding a match, it returns the default -1 value.

## ⏱️ Time and Space Complexity

### Time Complexity
- **Best Case**: O(1) - The target element is at the first position of the array 🚀
- **Average Case**: O(n/2) ≈ O(n) - On average, the algorithm needs to check half the elements 🏃
- **Worst Case**: O(n) - The target element is at the last position or not present 🐢

### Space Complexity
- O(1) - Only a constant amount of extra space is used regardless of input size 🧠

## ✅ Advantages and Disadvantages

### Advantages
- ✨ Simple to implement and understand
- 🔄 Works on unsorted arrays
- 🚫 No pre-processing required
- 💯 More efficient for small arrays
- 🔀 Does not require the array to be sorted

### Disadvantages
- 📏 Inefficient for large arrays
- ⏰ Linear time complexity makes it slow for large datasets
- 🐌 Much slower than binary search for sorted arrays

## 🎯 Use Cases
- 🧩 Searching in small unsorted arrays
- 🔍 One-time searches where pre-processing cost outweighs search benefits
- 📊 When the dataset cannot be sorted
- 🔄 When elements are being frequently added/removed from the array
