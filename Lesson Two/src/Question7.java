import java.util.Arrays;
import java.util.Scanner;
public class Question7 {
    public static void main(String[] args) {

        Scanner input= new Scanner (System.in);
        double []temp= new double[365];

        System.out.println(Arrays.toString(highlow(temp)));
    }
     public static double[] highlow(double[] temp){
         for(int i=0; i< 365; i++){
             Scanner input= new Scanner (System.in);
             System.out.println("Enter temperature of the day");
             temp[i]= input.nextDouble();
         }

         double min = temp[0];
         double max = temp[0];
         for(double temperature: temp){
             if (temperature > max){
                 max= temperature;
             }
             else if(temperature < min){
                 min=temperature;
             }
         }

         double[] newTemp = new double [2];
         newTemp[0]= min;
         newTemp[1]= max;


        return newTemp;
    }
}
