package SwichCase;

public class Month1 {
    public static void main(String[] args) {
        printMonth(1);
        printMonth(2);
        printMonth(3);
        printMonth(4);
        printMonth(5);
    }

    public static void printMonth(int monthNumber) {
        switch (monthNumber) {
            case 1:
                System.out.println("January");
                break;
            case 2:
                System.out.println("February");
                break;
            case 3:
                System.out.println("March");
                break;
            case 4:
                System.out.println("April");
                break;
            default:
                System.out.println("not match");

        }
    }
}
