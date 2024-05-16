import pack.*;

class error {
    int n1, n2;

    error(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    int division() {
        return n1 / n2;
    }
}

public class Exception {
    public static void main(String[] args) {
        try{
            packagedemo emp1 = new packagedemo(101,"Smit",200000);
            emp1.display();

            error e1 = new error(10, 0  );
            int c = e1.division();
            System.out.println("Value of division =" + c);
        }catch(ArithmeticException e){
            System.out.println(e);
        }
    }
}
