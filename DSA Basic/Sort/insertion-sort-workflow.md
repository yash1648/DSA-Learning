# 📥 Insertion Sort Workflow

## 📚 Introduction
Insertion Sort is a simple sorting algorithm that builds the final sorted array one item at a time. It works by taking elements from the unsorted part and inserting them at the correct position in the sorted part.

## ⚙️ Algorithm Workflow

```
1. Start with the second element (index 1)
2. Compare it with all elements in the sorted part (elements before current index)
3. Shift elements in the sorted part that are greater than the key to one position ahead
4. Insert the key at its correct position in the sorted part
5. Move to the next element and repeat steps 2-4 until all elements are processed
```

## 🔄 Workflow Diagram

```
START
  |
  v
For i = 0 to array.length-1
  |
  v
  Set key = array[i]
  |
  v
  Set j = i - 1
  |
  v
  While j >= 0 AND key < array[j]
  |
  v
    Shift array[j] to array[j+1]
    |
    v
    Decrement j
  |
  v
  Place key at array[j+1]
  |
  v
End For Loop
  |
  v
FINISH (Array is sorted)
```

## 💻 Code Analysis

```java
public void sort(int arr[]) {
    for (int i = 0; i < arr.length; i++) {
        int j = i - 1;
        int key = arr[i];
        while (j >= 0 && key < arr[j]) {
            arr[j + 1] = arr[j];
            j--;
        }
        arr[j + 1] = key;
    }
}
```

The code iterates through the array starting from index 0. For each element (key), it compares the key with the elements before it. If any element is greater than the key, it shifts that element one position ahead to make room for the key. This continues until it finds the correct position for the key, where it inserts the key.

## ⏱️ Time and Space Complexity

### Time Complexity
- **Best Case**: O(n) - When the array is already sorted 🚀
- **Average Case**: O(n²) - Requires about n²/4 comparisons and shifts on average 🏃
- **Worst Case**: O(n²) - When the array is sorted in reverse order 🐢

### Space Complexity
- O(1) - Only requires a constant amount of additional space for the key variable 🧠

## ✅ Advantages and Disadvantages

### Advantages
- ✨ Simple to implement and understand
- 🔄 In-place sorting algorithm
- 🧮 Stable sorting algorithm (maintains the relative order of equal elements)
- 💯 Efficient for small data sets
- ⚡ More efficient than Bubble Sort and Selection Sort in practice
- 🔍 Adaptive - performs better for partially sorted arrays

### Disadvantages
- 📏 Inefficient for large arrays
- ⏰ Quadratic time complexity makes it impractical for very large datasets
- 🐌 Much slower than more advanced algorithms for large inputs

## 🎯 Use Cases
- 💻 Online algorithms (can sort a list as it receives it)
- 🧩 Small datasets or nearly sorted datasets
- 📊 When simplicity of implementation is a priority
- 🔄 When data is continuously coming in and needs to be inserted in a sorted manner
