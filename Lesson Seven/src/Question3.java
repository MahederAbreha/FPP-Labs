public class Question3 {
    public static void main(String[] args) {
        //up-casting is performed here
        Question3 c1= new Child();
        c1.myMethod();
        Child p1= (Child) c1;
        p1.myMethod();

    }

    public void myMethod(){
        System.out.println("This is the parent method");

    }

}

    class Child extends Question3 {
    //String name;
    //Child c2= new Child();
        //

    @Override
    public void myMethod() {
        System.out.println("This is the child method");
    }
}
