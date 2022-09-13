public class Question1 {

        public static void main(String[] args) {
            // TODO Auto-generated method stub
            int [] arr = new int [] {33,21,45,78};
            System.out.println(arrAvg(arr));
        }

        public static float arrAvg (int [] arr) {

            int sum = 0; float avr = 0;

            for (int i= 0; i < arr.length; i++) {
                sum+= arr[i];
            }
            avr = (float)sum/ arr.length;
            return avr;


        }
    }


