package Inheritance;

public class Mamal extends Animal{
    public static void main(String[] args) {
        System.out.println("dog");
        Mamal mamal=new Mamal();
        mamal.run();

    }
    public static void run(){
        System.out.println("dog can run");
    }
}
