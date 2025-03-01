package Sort;

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
