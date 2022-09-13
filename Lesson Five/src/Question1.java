import java.sql.SQLOutput;
import java.time.DateTimeException;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Question1 {
    static Scanner scan = new Scanner(System.in);
    static private LocalDate birthDate;
    static private LocalDate currentDate;
    static private String name;

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter your name");
        String name = scan.nextLine();
        System.out.println(ageCalaulator());
    }


    static DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-d");

    public static boolean check(String input) {
        try {
            LocalDate.parse(input, formatter);
            return true;

        } catch (DateTimeException e) {
            return false;
        }
    }

    public void setBirthDate() {

        while (true) {
            System.out.println("Please enter your date of birth. In yyyy-M-dd");
            String input = scan.nextLine();
            boolean ch = check(input);
            if (ch == true)
                try {
                    this.birthDate = LocalDate.parse(input, formatter);
                    break;
                } catch (DateTimeException e) {
                    System.out.println(e.getCause());
                }
            else {
                System.out.println("Error, try again.");
            }

        }
    }

    public void setCurrentDate() {
        while (true) {
            System.out.println("Please enter today's date.In yyyy-M-dd");
            String input = scan.nextLine();
            boolean ch = check(input);
            if (ch == true)
                try {
                    this.currentDate = LocalDate.parse(input, formatter);
                    break;
                } catch (DateTimeException e) {
                    System.out.println(e.getCause());
                }
            else {
                System.out.println("Error, try again.");
            }

        }
    }
    static double ageCalaulator(){
        Question1 q1 = new Question1();
        q1.setBirthDate();
        q1.setCurrentDate();
        Period p= Period.between(birthDate,currentDate);
        double year= p.getYears();
        double month= p.getMonths();
        month= month/12;
        double age= year+month;
        return age;
    }
}
