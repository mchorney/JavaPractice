package hw17;

import java.util.HashMap;
import java.util.Map;

public class App {
    public static void main(String[] args) {
        HashMap<String,String>nameLastname = new HashMap<String,String>();

        nameLastname.put("Michael","jackson");
        nameLastname.put("Marilyn","Monroe");
        nameLastname.put("Dennis","Rodman");
        nameLastname.put("Sylvester","Stallone");
        System.out.println(nameLastname);

        nameLastname.get("Sylvester");
        System.out.println(nameLastname.get("Sylvester"));

        nameLastname.remove("Dennis");
        System.out.println(nameLastname);

        for(Map.Entry<String,String> entry : nameLastname.entrySet()){
            System.out.println(entry.getKey() + " "+entry.getValue());
        }

        Map<Integer,String> list = new HashMap<>();
        list.put(0,"jackson");
        list.put(1,"Monroe");
        list.put(2,"Rodman");
        list.put(3,"Stallone");
        list.get(4);
        System.out.println(list);

        for(Integer i:list.keySet()){
            System.out.println(" "+i+" , "+list.get(i));
        }






    }
}
