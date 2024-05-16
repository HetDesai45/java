class opration{
    private int n1;
    private int n2;

    opration(int num1,int num2){
        n1=num1;
        n2=num2;
    }

    final int sum(){
        return n1+n2;
    }

    final int sub(){
        return n1-n2;
    }

    final int mul(){
        return n1*n2;
    }

    final int div(){
        return n1/n2;
    }
}

class perform extends opration{

    perform(){
        super(12, 6);
    }
    

    void display(){
        System.out.println("-------------------------------------");
        System.out.println("Sum of two numbers = " + super.sum());
        System.out.println("Subtraction of two numbers = " + super.sub());
        System.out.println("Multiplication of two numbers = " + super.mul());
        System.out.println("Division of two numbers = " + super.div());
    }
}

public class inheri {
    public static void main(String[] args) {
        
        perform obj = new perform();
        obj.display();
    }
}
