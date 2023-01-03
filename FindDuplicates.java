package DataStruchuresCourse;

public class FindDuplicates {

    public static void findDuplicate(int arr[]) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = i; j < n; j++) {
                if (arr[i] == arr[j]) {
                    count++;
                }
            }
            if (count > 1) {
                System.out.println(arr[i]);
            }
        }
    }

    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 1, 4, 6 };
        findDuplicate(arr);
    }

}
