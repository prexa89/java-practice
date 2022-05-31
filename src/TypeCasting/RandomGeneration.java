package TypeCasting;

import java.util.Random;

public class RandomGeneration {
    public static void main(String[] args) {
        Random random = new Random();
        int result = random.nextInt();
        String email = "prexa"+ result+ "@yahoo.com";
        String password = "prex" +result;
        createUsers(email,password);  //everytime it ganarate new random email and password

    }public static void createUsers(String email,String password){
        System.out.println(email+password);
    }

}
