package Methods;

public class FinalVariableMethodOysterCard {
    final int MIN_BALANCE=10;

    public static void main(String[] args) {
        FinalVariableMethodOysterCard B=new FinalVariableMethodOysterCard();
        B.oyster(2);
        B.oyster(5);
        B.oyster(20);

    }public void oyster(int myBalance){
        if(myBalance>=MIN_BALANCE){
            System.out.println("open the gate");
        }else {
            System.out.println("you do not have enough balance,please top up");
        }
    }
}
