import java.util.Arrays;
import java.util.Scanner;
public class Question6 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub

        Scanner input= new Scanner (System.in);

        System.out.println("Enter the size of an Array");

        int num = input.nextInt();

        String [] names = new String[num];
        String name= input.nextLine();

        for (int i = 0; i < names.length; i++){
            System.out.println("Enter Name");
            names[i] = input.nextLine();
        }

        System.out.println(Arrays.toString(names));

        System.out.print(Arrays.toString(reverseStringArray(names)));


    }

    public static String[] reverseStringArray(String [] names) {
        String [] result= new String [names.length];
        for(int j=0; j<names.length; j++) {
            result[j] = reverse(names[j]);

        }
        return result;
    }


    public static String reverse(String s) {
        char[] ch= s.toCharArray();
        int start = 0;
        int end = ch.length-1;

        while(end>start) {
            char temp= ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            end--;
            start++;
        }
        return new String (ch);
    }
}
