package pack;

public class packagedemo {
    int id;
    String name;
    int sal;

    public packagedemo(int id, String name,int sal){
        this.id=id;
        this.name=name;
        this.sal=sal;
    }

    public void display(){
        System.out.println("Employee Id = "+this.id);
        System.out.println("Employee Name = "+this.name);
        System.out.println("Salary = "+this.sal);
    }
}
