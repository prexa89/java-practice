package IfElse;

public class Result {
    public static void main(String[] args) {
        checkResult(75);

    }public static void checkResult(int marks ) {
        if (marks >= 35 && marks <= 50) {
            System.out.println("Pass");
        } else if (marks >= 51 && marks <= 65) {
            System.out.println("First class");
        } else if (marks >= 66 && marks <= 75) {
            System.out.println("Distinction");

        }else
            System.out.println("fail");
    }}
