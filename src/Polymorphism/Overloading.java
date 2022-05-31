package Polymorphism;

public class Overloading {
    public static void main(String[] args) {
        System.out.println("my addtion is given below");
        Overloading overloading=new Overloading();
        overloading.add();
        overloading.add(5);
        overloading.add(9,7);
        overloading.add(3,5,"prexa");

    }
    public static void add(){
        int a=10;
        int b=9;
        System.out.println("addtion"+ (a +b));
    }public static void add(int a){
        System.out.println("addtion is :" + (++a));

    }public static void add(int a,int b){
        System.out.println("addtion is:"+ (a+b));
    }public static void add(int a,int b,String c){
        System.out.println("addtion is:"+(a+b+c));
    }
}
