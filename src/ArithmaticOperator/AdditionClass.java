package ArithmaticOperator;

public class AdditionClass {
    public static void main(String[] args) {
        int a=5,b=5,c=9,d=10,x=a+b+c,y=a*b*c,z=d-c;
        int v=c-a;
        int t=d/a;
        int s=c%b;
        System.out.println("Addition Operator" + x);
        System.out.println("Subtraction Operator"+z );
        System.out.println("Multiplication Operator"+y);
        System.out.println("Subtraction Operator2"+v);
        System.out.println("Division Operator"+t);
        System.out.println("Modulus Operator"+s);

    }
}
