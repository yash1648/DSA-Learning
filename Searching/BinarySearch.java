package Searching;

import Sort.BubbleSort;

public class BinarySearch {
    private BubbleSort bs;

    public int search(int a[], int target) {
        int resIdx = -1; // 4
        bs = new BubbleSort();
        bs.sort(a);
        int n = a.length; // 4
        int low = 0; // 4
        int high = n - 1; // 4
        int mid = -1;// 4
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
}
