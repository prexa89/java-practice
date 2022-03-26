package SwichCase;

public class MonthName {
    public static void main(String[] args) {
        MonthName m = new MonthName();
        m.selectMonth("January");
        m.selectMonth("February");
        m.selectMonth("March");
        m.selectMonth("April");
    }

    public void selectMonth(String monthName) {
        switch (monthName) {
            case "January":
                System.out.println("1");
                break;
            case "February":
                System.out.println("2");
                break;
            case "March":
                System.out.println("3");
                break;
            case "April":
                System.out.println("4");
        }
    }
}

