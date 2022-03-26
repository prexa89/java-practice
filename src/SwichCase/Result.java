package SwichCase;

public class Result {
    public static void main(String[] args) {
    printResult(35);
    printResult(60);
    printResult(70);
    printResult(80);
    }public static void printResult(int marks) {
        switch (marks){
            case 35:
                System.out.println("pass");break;
            case 60:
                System.out.println("first class");break;
            case 70:
                System.out.println("Distinction");break;
            default:
                System.out.println("fail");

        }
    }
}
