package LoopPractice;

public class FindEven {
    public static void main(String[] args) {
        findEven(100, 500);

    }
    public static void findEven(int startNumber, int endNumber) {
        System.out.println("This is my evennumber from " + startNumber + "to " + endNumber);
        for (int i = startNumber; i <= endNumber; i++) {
            if (i % 2 == 0) {
                System.out.println("My Evennumber is " + i);
            }
        }
    }
}
