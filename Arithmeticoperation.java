class Number{
    protected int num1;
    protected int num2;

    Number(int n1,int n2){
        this.num1=n1;
        this.num2=n2;
    }
}

class Opertaion extends Number{
    Opertaion(int n1,int n2){
        super(n1, n2);
    }

    void sum(){
        int ans;
        ans=num1+num2;
        System.out.println("Addition = "+ans);
    }

    void sub(){
        int ans;
        ans=num1-num2;
        System.out.println("Subtraction = "+ans);
    }

    void mul(){
        int ans;
        ans=num1*num2;
        System.out.println("Multiplication = "+ans);
    }

    void div(){
        int ans;
        ans=num1/num2;
        System.out.println("Division = "+ans);
    }
}

public class Arithmeticoperation {
    public static void main(String[] args) {
        Opertaion obj = new Opertaion(45, 6);
        obj.sum();
        obj.sub();
        obj.mul();
        obj.div();
    }
}
