package SwichCase;

public class WeekDaysSwitch {
    public static void main(String[] args) {
        printDay(1);
        printDay(2);
        printDay(3);
        printDay(4);
        printDay(5);
        printDay(6);
        printDay(7);
        printDay(8);
    }public static void printDay(int dayNumber){
        switch (dayNumber){
            case 1:
                System.out.println("Monday"); break;
            case 2:
                System.out.println("Tuesday"); break;
            case 3:
                System.out.println("Wednesday");break;
            case 4:
                System.out.println("Thursday");break;
            case 5:
                System.out.println("Friday");break;
            case 6:
                System.out.println("Saturday");break;
            case 7:
                System.out.println("Sunday");break;
            default:
                System.out.println("Invalid");
        }   }}
