package DataStruchuresCourse;

public class BinarySearchOfArray {

    public static boolean binarySearch(int arr[], int num) {
        int start = 0;
        int end = arr.length - 1;
        while (start <= end) {
            int mid = (end - start) / 2 + start;
            if (arr[mid] == num) {
                return true;
            } else if (arr[mid] > num) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 7, 13, 17, 18, 20 };
        int num = 17;
        System.out.println(binarySearch(arr, num));

    }

}
