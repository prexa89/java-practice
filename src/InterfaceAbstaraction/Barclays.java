package InterfaceAbstaraction;

abstract public class Barclays implements Bank {
    public void withdrawal(){
        System.out.println("This is Withdrawal Method from Bank/interface class");
    }public void balance(){
        System.out.println("This is balance Method from Bank interface class");
    }public void deposit(){
        System.out.println("This is deposit Method from Bank interface class ");
    }public abstract void ATM();//this method did not use from  Bank interface class
    public abstract void moneyTransfer();//this method did not use from Bank interface class

    public static void main(String[] args) {
        Barclays barclays=new Barclays() {
            @Override
            public void ATM() {

            }

            @Override
            public void moneyTransfer() {

            }
        };  barclays.balance();
            barclays.deposit();
            barclays.withdrawal();
    }

}
