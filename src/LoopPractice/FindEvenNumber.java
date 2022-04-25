package LoopPractice;

public class FindEvenNumber {
    public static void main(String[] args) {
        findEven(1,10);

    }public static void findEven(int startNumber,int endNumber){
        System.out.println("This is my evennumber from "+ startNumber+"to "+ endNumber);
        for(int i=startNumber;i<=endNumber;i++){
            if(i%2==0){
                System.out.println("My Evennumber is " + i);
            }else System.out.println("My Oddnumber is "+ i);
        }
    }

}
