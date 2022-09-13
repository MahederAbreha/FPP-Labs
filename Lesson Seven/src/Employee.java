public class Employee {
    public static void main(String[] args) {
    }
    private int empID;
    private String name;
    private String dept;
    private String designation;
    private double salary;

    public Employee(int empID, String name, String dept, String designation, double salary){
        System.out.println();
    }

    public int getEmpID() {
        return empID;
    }
    public void setEmpIDEmpID(int empID) {
        this.empID= empID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public boolean equals(Object obj) {
        if (obj== null){
            return false;
        }
        else if (getClass()!= obj.getClass())
            return false;
        else {
            Employee employee= (Employee) obj;
            return (designation.equals(employee.designation));
        }
    }
    public void addBonus(){
       double addBonus= +salary;
    }
    public void printDetails(){
        System.out.println(name + "from"+ dept+ " with an ID num of"+ empID+ "is" + designation+ "with a total salary of"+ salary);
    }
}


