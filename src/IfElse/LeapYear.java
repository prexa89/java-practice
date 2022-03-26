package IfElse;

public class LeapYear {
    public static void main(String[] args) {
        int year = 2002;

        System.out.println(" This Year is " + year);
        if ((year % 4 == 0) && (year % 100 == 0))
        {
            System.out.println(" This year is Leapyear");
        }else
            System.out.println("This is not leap year");
    }

        }


