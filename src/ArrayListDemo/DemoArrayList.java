package ArrayListDemo;

import java.util.ArrayList;

public class DemoArrayList {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<String>();
        list.add("prexa");
        list.add("sam");
        list.remove(1);
        list.remove("sam");
        System.out.println(list);



    }
}
