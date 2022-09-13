import java.util.Arrays;

public class Questionthree {
    public static void main(String[] args) {
        Question3 ob = new Question3();
        int[] a = {4, 47, 8, 56, 20, 3};
        Arrays.sort(a);
        System.out.println(binarySearch(a, 0, 6, 3) );
    }

    public static int binarySearch(int[] a, int s, int e, int x) {
        while(e>= s){
            int mid= s+ (e-s)/2;
            if (a.length ==0){
                return -1;
            }
            else if (a[mid]== x){
                return mid;
            }
            else if(a[mid]> x){
                return binarySearch (a,s,mid-1,x);
            }
            else{
                return binarySearch (a,mid+1,e,x);
            }

        }
        return -1;
    }
}
