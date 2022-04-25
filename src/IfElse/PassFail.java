package IfElse;

public class PassFail {
    public static void main(String[] args) {
        checkResult(35);
        checkResult(30);
        checkResult(62);
        checkResult(76);
    }

    public static void checkResult(int marks) {
        if (marks >= 35) {
            System.out.println("Pass");
        } else if (marks < 35) {
            System.out.println("fail");
        } else if (marks <= 60) {
            System.out.println("First Class");
        } else if (marks <= 75) {
            System.out.println("Distinction");
        }

    }
}

