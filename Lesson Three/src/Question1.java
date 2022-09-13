public class Question1 {
    public static void main(String[] args) {

        //Scanner scan= new Scanner(System.in);
        //System.out.println("Enter x .");
        //double x=  scan.nextDouble();
        //System.out.println("Enter n .");

        //int n=  scan.nextInt();
        double result = Power(2.0,0);

        System.out.println(result);

    }
    public static double Power(double x, int n){

        if(n!=0){
            return (x* Power(x, n-1));
        }
        else{
           return 0;
        }

    }
}
