package SwichCase;

public class Result3 {
    public static void main(String[] args) {
        Result3 res=new Result3();
        res.marks("pass");
        res.marks("First class");
        res.marks("Distinction");
        res.marks("Second class");
    }public void marks(String result3){
        switch (result3) {
            case "pass":
                System.out.println("35");break;
            case "First class":
                System.out.println("60");break;
            case "Distinction":
                System.out.println("70");break;

            default:
                System.out.println("not match");
        }

    }
}
