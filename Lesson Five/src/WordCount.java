import java.util.Scanner;

public class WordCount {
    static int count;
    public static void main(String[] args) {

       count();
    }

    public static void count(){
        Scanner input = new Scanner(System.in);
        System.out.println("Pease enter sentence.");
        String sentence= input.nextLine();
        String[] splitword = sentence.split(" ");
        setCountZero();
        for (int i = 0; i < splitword.length; i++) {
            if (splitword[i].startsWith("a") || splitword[i].startsWith("A")) {
                decreaseCountByOne();
            } else {
                increaseCountByOne();
            }
        }

        printTotalCount();
    }
    private static void setCountZero() {
        count=0;
        System.out.print(getCurrentCount() + "  ");
    }

    private static void increaseCountByOne() {
        count++;
        System.out.print(getCurrentCount() + "  ");
    }

    private static void decreaseCountByOne() {
        count--;
        System.out.print(getCurrentCount() + "  ");
    }
    private static int getCurrentCount() {
        return count;
    }
    private static void printTotalCount() {
        System.out.println("Total count of words is: " + count);
    }


}

