package Exception;

public class Throw {
    public static void main(String[] args) {
        checkAge(17);//if age is above 18 then it is not throw any exception

    } public static void checkAge(int age){
        if (age <18){
            throw new
                    ArithmeticException("under Age");
        }else {
            System.out.println("Above age");
        }
    }
}
