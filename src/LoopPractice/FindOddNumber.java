package LoopPractice;

public class FindOddNumber {
    public static void main(String[] args) {
        findOddNumber(50,100);

    }public static void findOddNumber(int startNumber,int endNumber){
        System.out.println("This is Oddnumber from "+ startNumber+ "to "+ endNumber);
        for (int x = startNumber; x<=endNumber;x++){
            if (x%2!=0){
                System.out.println("Odd Number is "+ x);
            }
        }
    }
}
