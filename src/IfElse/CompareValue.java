package IfElse;

public class CompareValue {
    public static void main(String[] args) {

    compareValue (44,89);
    compareValue(90,100);
    compareValue(100,54);
    }
    public static void compareValue(int x,int y){
    if (x<=y)
        System.out.println( x + "is minimum value");
    else
        System.out.println(y + "is minimum value");
    }
}
