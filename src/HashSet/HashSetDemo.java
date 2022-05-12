package HashSet;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<String> set=new HashSet<>();
        set.add("Prexa");
        set.add("Ahmedabad");
        set.add("London");
        set.add("Prexa");//Hashset can not add duplicate value otherwise it is same as ArrayLIst
        System.out.println(set);
        System.out.println(set.size());
    }
    }
