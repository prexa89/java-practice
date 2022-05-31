package Exception;

public class TryCatch {
    public static void main(String[] args) {
        try{int a[]={2,3,4};
            System.out.println(a[3]);}

            catch(IndexOutOfBoundsException a){
                System.out.println(a);

            }finally{
                System.out.println("This is my final code");
            }
    }
}
