public class Question3 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        int array[] = new int [] {5,10,15,36,48,50,111};
        System.out.println(count(array));

    }
    public static int count (int [] array) {
        int countEven=0;
        for (int i=0; i<array.length;i++) {
            if ((array[i])%2==0)
                countEven++;

        }
        System.out.println(array.length-countEven);
        return countEven;
    }
}

