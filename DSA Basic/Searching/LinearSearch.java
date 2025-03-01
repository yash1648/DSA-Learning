package Searching;

public class LinearSearch {
    public int search(int a[], int target) {
        int eleIdx = -1;
        for (int i = 0; i < a.length; i++)
            if (a[i] == target)
                return i;

        return eleIdx;
    }
}