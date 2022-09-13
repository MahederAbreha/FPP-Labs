public class Question4 {
    public static void main(String[] args) {
        // TODO Auto-generated method stub
        String [] arr= new String []    {"Sam","Mahlet","David","Chaltu","Victoria"};
        System.out.print(fNames(arr, "Sam"));

    }
    public static boolean fNames (String []arr, String c1) {
        for (int i=0; i<arr.length;i++) {
            if (arr [i]==c1)
                return true;
        }
        return false;

    }

}
