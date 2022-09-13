public class Question2 {
    public static void main(String[] args) {
        Question2 Q2= new Question2();

        System.out.println(Q2.minchar("hello",0));

    }
    public  char minchar(String input, int position){
        char min = 'z';
        if(position < input.length()){
            if(input.charAt(position) < min){
                min = input.charAt(position);

            }
            char values = minchar(input, position+1);
            if (values < min) {
                min = values;
            }

        }
        return min;
    }
    }








