import java.util.Arrays;
public class Question3 {
    public static void main(String[] args) {
        Question3 ob = new Question3();
        int[] a = {4, 47, 8, 56, 20, 3};
        Arrays.sort(a);
        System.out.println(a);
        int n = a.length;
        int x = 10;
        int result = ob.binarySearch(a, x);
        if (result == -1)
            System.out.println("Element not present");
        else
            System.out.println("Element found at index " + result);
    }


    public static int binarySearch(int[] a, int n) {
        int x = 0, y = a.length - 1;
        while (x <= y) {
            int m = x + (y - x) / 2;

            if (a[m] == n)
                return m;

            if (a[m] < n)
                x = m + 1;

            else
                y = m - 1;
        }

        return -1;

    }
}