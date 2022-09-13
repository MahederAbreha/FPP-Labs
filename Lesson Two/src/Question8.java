import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
public class Question8 {
    public static void main(String[] args) {
        ArrayList<String> fortunes = new ArrayList<String>();
        fortunes.add("A faithful friend is a strong defense.");
        fortunes.add("A lifetime of happiness lies ahead of you.");
        fortunes.add("A smile is your personal welcome mat.");
        fortunes.add("Your future is programming.");
        fortunes.add("Today your luck changed completely.");
        fortunes.add("success is right around the corner.");
        fortunes.add("A new romance is in the future.");
        fortunes.add("There is great talent in your future.");
        fortunes.add("You will get good news.");
        fortunes.add("Soon, a visitor shall delight you.");

        Fortune.fort();

    }

    class Fortune {
        static String fortune1, fortune2, fortune3, fortune4, fortune5, fortune6, fortune7, fortune8, fortune9, fortune10;

        public Fortune(String f1, String f2, String f3, String f4,
                       String f5, String f6, String f7, String f8, String f9, String f10) {
            fortune1 = f1;
            fortune2 = f2;
            fortune3 = f3;
            fortune4 = f4;
            fortune5 = f5;
            fortune6 = f6;
            fortune7 = f7;
            fortune8 = f8;
            fortune9 = f9;
            fortune10 = f10;

        }


        public static void fort() {
            int min = 0;
            int max = 10;
            int avg = max - min + 1;


            while (true) {
                int randomelt;
                System.out.println("Press 'Y' to know your fortune or press 'N' to exit the program.");
                Scanner input = new Scanner(System.in);
                String answer = input.nextLine();

                for (int i = 0; i < 10; i++) {

                    if (input.equals("Y")) {
                        randomelt = (int) (Math.random() * avg);
                        System.out.println("You fortune is: " + randomelt);
                    }



                    else if (input.equals("N")) {
                        System.out.println("Good bye");
                        System.exit(0);
                    }
                    else
                        System.out.println("Please Put either 'Y' or 'N'");
                }

            }
        }

    }
}

