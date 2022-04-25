package Array;

public class ArrayPractice5 {
    public static void main(String[] args) {
        int myNumber[]={1,4,5,7,9};
        for(int i =0;i<myNumber.length;i++){
            if(myNumber[i]%2==0){
                System.out.println(myNumber[i] + " is evennumber");
            }
        }
    }
}
