# 🔄 SwapVar Utility Class

## 📚 Introduction
The SwapVar class is a utility class that provides methods for swapping elements within an array and swapping integer variables. It's commonly used within sorting algorithms when elements need to be reordered.

## ⚙️ Class Methods

### 1️⃣ swapArray Method
```
1. Take an array and two indices as input
2. Store the value at the first index in a temporary variable
3. Replace the value at the first index with the value at the second index
4. Replace the value at the second index with the temporary variable
```

### 2️⃣ swapVar Method
```
1. Take two integer variables as input
2. Store the first variable value in a temporary variable
3. Replace the first variable's value with the second variable's value
4. Replace the second variable's value with the temporary variable
5. Return both swapped values in a new array
```

## 💻 Code Analysis

```java
public class SwapVar {
    public static void swapArray(int arr[], int a, int b) {
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
    public static int[] swapVar(int a, int b) {
        int temp = a;
        a = b;
        b = temp;
        int arr[] = { a, b };
        return arr;
    }
}
```

The class contains two static methods:

1. **swapArray**: This method swaps two elements in an array by their indices. It's a void method that modifies the array in-place.

2. **swapVar**: This method attempts to swap two integer variables. However, due to Java's pass-by-value mechanism, this method doesn't actually swap the original variables in the calling method. Instead, it returns a new array containing the swapped values.

## 🧐 Important Notes

- 📌 The `swapArray` method works as expected because arrays in Java are passed by reference
- ❗ The `swapVar` method has a limitation - in Java, primitive values are passed by value, not by reference
- 🔄 When calling `swapVar(x, y)`, the original variables x and y in the calling method will not be changed
- 📊 To use the result of `swapVar`, you need to extract the values from the returned array

## 🎯 Use Cases
- 🔄 Used extensively in sorting algorithms like Bubble Sort, Selection Sort, and QuickSort
- 🧮 Helpful utility for rearranging elements in arrays
- 📊 Can be used wherever element reordering is needed
- 💻 Simplifies code by abstracting the swap operation

## ✨ Example Usage

```java
// Using swapArray
int[] numbers = {5, 2, 8, 1};
SwapVar.swapArray(numbers, 0, 3);  // Swaps 5 and 1
// numbers is now {1, 2, 8, 5}

// Using swapVar (note the limitation)
int a = 10;
int b = 20;
int[] swapped = SwapVar.swapVar(a, b);
// a is still 10, b is still 20
// swapped contains {20, 10}
```
