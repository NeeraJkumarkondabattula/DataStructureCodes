package DataStruchuresCourse;

public class SelectionSort {

    public static int[] selectionSort(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int small = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[i] > arr[j]) {
                    small = j;
                }
            }
            int temp = arr[small];
            arr[small] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }

    private static void print(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 1, 7, 19, 20 };
        print(selectionSort(arr));
    }

}
