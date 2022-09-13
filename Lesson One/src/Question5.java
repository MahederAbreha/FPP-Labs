public class Question5 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        System.out.println(maxNum(10,15,20));
    }

    public static int maxNum(int a, int b, int c) {
        if (a>b && a>c)
            return a;
        else if (b>a && b>c)
            return b;
        else
            return c;


    }
}
