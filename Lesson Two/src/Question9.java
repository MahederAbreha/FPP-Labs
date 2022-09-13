import java.util.ArrayList;
import java.util.Arrays;
import java.util.Optional;
import java.util.Scanner;

public class Question9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the sequence");
        String given = input.nextLine();
        ArrayList<String> codon = new ArrayList<String>();

        int count = 0;
        while (true) {
            if (input.equals("")) {
                break;
            }
        }


        for (int i = 0; i < given.length(); i++) {
            if (Character.isLetter(given.charAt(i))) {
                count++;
            }
            if (count % 3 != 0) {

                System.out.println("String: " + removeLastChar(given));
            }
            if (count % 3 == 0) {
                System.out.println("String: " + (given));
            }
        }
    }

    public static String removeLastChar(String given) {
        return Optional.ofNullable(given)
                .filter(str -> str.length() != 0)
                .map(str -> str.substring(0, str.length() - 1))
                .orElse(given);
    }

//    public static String method(String given) {
//
//    }
}





