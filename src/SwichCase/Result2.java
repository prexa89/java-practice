package SwichCase;

public class Result2 {
    public static void main(String[] args) {
        marks("pass");
        marks("First class");
        marks("Distinction");


    }public static void marks(String grade){
        switch (grade){
            case "pass":
                System.out.println("35");break;
            case  "First class":
                System.out.println("60");break;
            case "Distinction" :
                System.out.println("70");
        }

    }
}
