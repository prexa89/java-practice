package Array;

public class ArrayPractice1 {
    public static void main(String[] args) {
        int myNumber[] = {1,2,3,4};
        String myName[]={"sunday","monday","tuesday"};
        System.out.println(myName.length);
        System.out.println(myNumber.length);
        System.out.println(myNumber[0]);// in zero index there is number 1 so print number 1
        myNumber[0]=9;
        System.out.println(myNumber[0]); // in zero index change/reassign the value so it print 9
        System.out.println(myName[1]); //  it print monday
        myName[1]="friday";
        System.out.println(myName[1]);// in 1 position index reassign the value so it print friday
    }
}
