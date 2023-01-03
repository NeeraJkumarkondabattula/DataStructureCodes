package DataStruchuresCourse;

public class ConvertBinaryToDecimal {

    public static int convertBinaryToDecimal(String n) {
        int conversion = 1;
        int result = 0;
        for (int i = n.length() - 1; i >= 0; i--) {
            if (n.charAt(i) == '1') {
                result = result + conversion;
            }
            conversion = conversion * 2;
        }
        return result;
    }

    public static int convertBinaryToDecimal(long n) {
        int conversion = 1;
        int result = 0;
        while (n != 0) {
            long last = n % 10;
            if (last == 1) {
                result = result + conversion;
            }
            n = n / 10;
            conversion = conversion * 2;
        }
        return result;
    }

    public static void main(String[] args) {
        String str = "10111110";
        System.out.println(convertBinaryToDecimal(str));
        long num = 10111110;
        System.out.println(convertBinaryToDecimal(num));
    }

}
