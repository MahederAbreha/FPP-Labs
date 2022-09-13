
public class Question5 {
    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        int[] arr2 = {4, 3, 1, 2, 5};

        boolean equal = Check(arr1, arr2);
        System.out.println("The two arrays are =" + equal);
    }

    public static boolean Check(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            return false;
        }
        int count = 0;
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    count++;
                    continue;
                }
            }
        }

        if (count == arr2.length) {
            return true;
        }
        else {
            return false;
        }
    }

}
