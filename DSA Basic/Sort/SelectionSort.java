package Sort;

public class SelectionSort {
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
}
