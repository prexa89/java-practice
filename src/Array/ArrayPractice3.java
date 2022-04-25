package Array;

public class ArrayPractice3 {
    public static void main(String[] args) {
        int myNumber[]={2,4,6,8};
        int sum = 0;
        for(int i=0;i<myNumber.length;i++){//length is 4
            sum= sum+myNumber[i];
            System.out.println(sum);
        }
    }
}
