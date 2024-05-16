abstract class employee{
    private String name;
    private int empid;
    protected double basicsal;

    employee(String name,int id,double bsal){
        this.name=name;
        this.empid=id;
        this.basicsal=bsal;
    }

    abstract double calculatesalary();

    void display(){
        System.out.println("Name = "+name);
        System.out.println("Employee ID = "+empid);
        System.out.println("Basic Salary = " + basicsal);
    }
}

class manager extends employee{

    private double DA;
    private double HRA;

    manager(String name,int eid,double bsal,double da,double hra){
        super(name, eid, bsal);
        this.DA=da;
        this.HRA=hra;
    }

    double calculatesalary(){
        return basicsal+DA+HRA;
    }
}

class salesman extends employee{
    private double DA;
    private double HRA;
    private double TA;

    salesman(String name,int eid,double bsal,double da,double hra,double ta){
        super(name, eid, bsal);
        this.DA=da;
        this.HRA=hra;
        this.TA=ta;
    }

    double calculatesalary(){
        return basicsal+DA+HRA+TA;
    }
}

public class employeedemo {
    public static void main(String[] args) {
        employee[] emp = new employee[2];

        emp[0] = new manager("Om", 101, 50000.0, 10000.0, 8000.0);
        emp[1] = new salesman("Smit", 102, 40000.0, 8000.0, 6000.0, 3000.0);

        System.out.println("Employee Details----------------->");
        for(employee emps:emp){
            emps.display();
            System.out.println("Net Salary = "+emps.calculatesalary());
            System.out.println("--------------------");
        }
    }
}
