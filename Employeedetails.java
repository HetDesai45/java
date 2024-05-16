abstract class Employee {
    protected int eid;
    protected String name;
    protected double salary;
    
    Employee(int id,String n,double sal){
        this.eid=id;
        this.name=n;
        this.salary=sal;
    }

    abstract void display();
}

class Details extends Employee{
    Details(int id,String n,double sal){
        super(id,n,sal);
    }

    void display(){
        System.out.println("Employee ID = "+eid);
        System.out.println("Employee Name = "+name);
        System.out.println("Employee Salary = "+salary);
    }
}

public class Employeedetails {
    public static void main(String[] args) {
        Details obj = new Details(101, "Om", 50000);
        obj.display();
        
    }
}
