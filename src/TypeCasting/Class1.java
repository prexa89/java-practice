package TypeCasting;

public class Class1 {
    public static void main(String[] args) {
        int myInt = 9;  //wide casting
        System.out.println(myInt);
        double myDouble = myInt;
        System.out.println(myDouble);

        //narrow casting
        double myDouble1 = 5.1;
        System.out.println(myDouble1);
        int myInt1 = (int) myDouble1;
        System.out.println(myInt1);

    }
}
