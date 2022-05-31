package Abstraction;

public  class ClassC  implements InterfaceA,InterfaceB{
     public static void main(String[] args) {
         ClassC classC=new ClassC();
         classC.colour();
         classC.gearBox();
         classC.tyreSize();
         classC.animalSound();
         classC.run();


    }

    @Override
    public void colour() {
        System.out.println("red");

    }

    @Override
    public void tyreSize() {
        System.out.println("big");

    }

    @Override
    public void gearBox() {
        System.out.println("auto");

    }

    @Override
    public void animalSound() {
        System.out.println("moo");

    }

    @Override
    public void run() {
        System.out.println("faster");

    }
}
