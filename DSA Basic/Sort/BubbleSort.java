package Sort;

public class BubbleSort {

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
}
