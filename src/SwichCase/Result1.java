package SwichCase;

public class Result1 {
    public static void main(String[] args) {
        Result1 res = new Result1();
        res.marks(35);
        res.marks(60);
    }public void marks(int result1){
        switch (result1){
            case 35:
                System.out.println("pass");break;
            case 60:
                System.out.println("first class");

        }
    }
}
