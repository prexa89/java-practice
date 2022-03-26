package IfElse;

public class CompareThreeValues {
    public static void main(String[] args) {
        CompareThreeValues compare = new CompareThreeValues();
        compare.compareThreeValues(40, 50, 90);    }

    public void compareThreeValues(int a, int b, int c) {
        if (a > b) {
            if (a > c) System.out.println(a + "is greatest value");
            else System.out.println(c + " is greatest value");
        } else {
            if (b > c) System.out.println(b + "is greatest value");
            else System.out.println(c + "is greatest value");
        }  }}
