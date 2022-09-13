import java.util.Arrays;
public class Question2 {


        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int arr[] = new int [] {5,10,15,36,48,50};
            System.out.println(Arrays.toString(array1(arr)));

        }

        public static int[] array1 (int [] array) {
            int countOdd=0; int countEven=0;
            int []array1= new int [2];
            for (int i=0; i<array.length;i++) {
                if (array[i]%2!=0) {
                    countOdd++;
                }
                else {
                    countEven++;
                }

                array1=new int []{countOdd,countEven};

            }

            return array1;
        }

    }

