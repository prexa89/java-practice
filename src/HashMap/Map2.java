package HashMap;
import java.util.*;

public class Map2 {
    public static void main(String[] args) {
        SortedMap<Integer,String> map= new TreeMap<Integer, String>();
        map.put(10,"prexa");
        map.put(20,"London");
        map.put(30,"usa");
        System.out.println(map);
        map.remove(30);
        map.size();
        System.out.println(map);
        ArrayList<String> value=new ArrayList<String>();
        ArrayList<Set<Integer>>key=new ArrayList<Set<Integer>>();
        key.add(map.keySet());
        System.out.println(map.keySet());
       // map.<Integer>keys=map.keySet();
        //System.out.println(Keys);
        //set.<String>values=(set<String>)map.value();
       // System.out.println(values);
    }
}
