package DataStruchuresCourse;

import java.util.ArrayList;

public class PrimeFactors {
    public static ArrayList<Integer> primeFactors(int num) {
        ArrayList<Integer> l = new ArrayList<>();
        int factor = 2;
        while (num > 1) {
            if (num % factor == 0) {
                l.add(factor);
                num = num / factor;
            } else {
                factor = factor + 1;
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int num = 100;
        System.out.println(primeFactors(num));

    }
}