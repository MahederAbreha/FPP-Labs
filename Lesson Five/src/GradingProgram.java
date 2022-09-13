public class GradingProgram {
    public static void main(String[] args) {
        System.out.println(calcGrade(5,10,10,80,100));
    }
    public static double calcGrade(double q1, double q2, double q3, double mid, double finalExam){
        double midtot = mid* 0.35;
        double finTot = finalExam * 0.4;
        double q1Tot = q1 * 0.083;
        double q2Tot = q2 * 0.083;
        double q3Tot = q3 * 0.083;

        double total = midtot + finTot + q1Tot + q2Tot + q3Tot;

        System.out.println("q1= " + q1Tot + " q2= " + q2Tot + " q3= " + q3Tot + " mid= " + midtot + " final= " + finTot);

        if(total>=90)
            System.out.println('A');
        else if(total>=80)
            System.out.println('B');
        else if(total>=70)
            System.out.println('C');
        else if(total>=60)
            System.out.println('D');
        else
            System.out.println('F');

        return  total;
    }
}
