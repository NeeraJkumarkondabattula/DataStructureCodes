package DataStruchuresCourse;

public class FindCharCount {

    public static int findCharCount(char c, String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == c) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        char c = 'm';
        String str = "iam a good tech and waiting for opportunity";
        System.out.println(findCharCount(c, str));

    }
}
