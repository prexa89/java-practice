package Encapsultion;

public class Person {
    private String name;
     public String getName(){ //getter method
         return name;

     }public String setName(){
         return  name;

    }public void setName(String name){ // setter method
         this.name=name;

    }

    public static void main(String[] args) {
        Person person = new Person();
        person.setName("Prexa");
    }
}
