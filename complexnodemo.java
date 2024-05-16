class complex{
    private double real1;
    private double real2;

    complex(double r1, double r2){
        this.real1 = r1;
        this.real2 = r2;
    }

    complex add(int a){
        return new complex(this.real1 + a, this.real2);
    }

    complex add(complex o){
        return new complex(this.real1 + o.real1, this.real2 + o.real2);
    }
    
    complex sub(complex a){
        return new complex(this.real1 - a.real1, this.real2 - a.real2); 
    }
}

public class complexnodemo {
    public static void main(String[] args) {
        complex s1 = new complex(3.0, 4.0);
        complex s2 = new complex(1.0, 2.0);

        complex res1 = s2.add(5);
        complex res2 = s1.add(s2);
        complex res3 = s1.sub(s2);

        System.out.println("s2 + 5 = " + res1);
        System.out.println("s1 + s2 = " + res2);
        System.out.println("s1 - s2 = " + res3);

    }
}
