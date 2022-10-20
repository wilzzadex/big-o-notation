public class QuadraticTime {
    public static void main(String[] args) {
        int arr[] = {2, 5, 1, 6, 9};
        bubblesort(arr, 5);
        for (int i = 0; i < 5; i++) {
            System.out.printf(arr[i] + " ");
        }
    }

    public static void bubblesort(int arr[], int n)
    {

        if (n == 0 || n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++)
        {

            if (arr[i] > arr[i + 1]) {
                swap(arr, i, i + 1);
            }
        }
        bubblesort(arr, n - 1);
    }

    public static final void swap (int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
