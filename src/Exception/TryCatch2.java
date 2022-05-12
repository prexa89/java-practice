package Exception;

public class TryCatch2 {
    public static void main(String[] args) {
        try {
            int data=25;
            System.out.println(25/0);
        }catch (Exception e){
            System.out.println(e);
        }finally {
            System.out.println("hello");
        }
    }
}
