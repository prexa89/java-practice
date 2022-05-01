package Inheritance;

public class Car extends Vehicle{
    public static void main(String[] args) {
        Car car=new Car();
        car.colour();
        car.name();


    }public static void colour(){
        System.out.println("My car is red");//Method overidding


    }public static void name(){
        System.out.println("My car is Bmw");
    }
}

