import java.util.Scanner;

class A{

    int a;
    int b;
    Scanner sc = new Scanner(System.in);

    void setdata(){
        System.out.print("Enter value of a = ");
        a = sc.nextInt();
        System.out.print("Enter value of b=");
        b = sc.nextInt();
    }

}

class B extends A{

    
    void methodB(){
        System.out.println("Print B");
    }

    void sum(){
        int c = a+b;
        System.out.println("Sum of two numbers = " +c);
    }

}

class C extends B{
    void methodC(){
        System.out.println("Print C");
    }
}

public class inheritancedemo {
    public static void main(String[] args) {
        B obj1 = new B();
        C obj2 = new C();
    

        obj1.setdata();
        obj1.sum();

    }
}
