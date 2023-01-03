package DataStruchuresCourse;

import java.util.ArrayList;
import java.util.List;

public class IntersectionOfTwoArrays {

    public static List<Integer> intersectionOfTwoArrays(int a[], int b[]) {
        List<Integer> l = new ArrayList<>();
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b.length; j++) {
                if (a[i] == b[j]) {
                    l.add(a[i]);
                    a[i] = -1;
                    b[j] = -1;
                }
            }
        }
        return l;
    }

    public static void main(String[] args) {
        int a[] = { 11, 11, 12, 12, 13 };
        int b[] = { 11, 12, 12, 13, 13 };
        System.out.println(intersectionOfTwoArrays(a, b));
    }

}
