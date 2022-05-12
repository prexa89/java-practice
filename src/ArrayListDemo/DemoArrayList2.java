package ArrayListDemo;

import java.util.ArrayList;

public class DemoArrayList2 {
    public static void main(String[] args) {
       ArrayList<Integer> list=new ArrayList<>();
       list.add(500);
       list.add(900);
       list.add(1000);
        System.out.println(list.get(2));
        System.out.println(list.add(600));
        System.out.println(list);
        System.out.println(list.remove(2));
        System.out.println(list.remove(500));
        System.out.println(list.get(2));
}}
