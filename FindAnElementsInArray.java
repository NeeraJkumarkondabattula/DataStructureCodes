package DataStruchuresCourse;

public class FindAnElementsInArray {
    public static boolean sreachWord(String word, String str[]) {
        for (String x : str) {
            if (x.equals(word)) {
                return true;
            }
        }
        return false;
    }

    public static int sreachIndex(String word, String str[]) {
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals(word)) {
                return i;
            }
        }
        return -1;
    }

    public static int sreachInteger(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                return i;
            }
        }
        return -1;
    }

    public static void sreachIntegerMultiple(int num, int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == num) {
                System.out.print(i + " ");
            }
        }
    }

    public static void main(String[] args) {
        String word = "neeraj";
        String[] str = { "ravi", "neeraj", "raju", "balaji", "megha" };
        System.out.println(sreachIndex(word, str));

        int num = 10;
        int arr[] = { 10, 20, 30, 10, 40, 50 };
        sreachIntegerMultiple(num, arr);
    }
}
