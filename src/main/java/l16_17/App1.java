package l16_17;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.Map;

public class App1 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("Germany","Berlin");
        map.put("China","Beijing");
        map.put("Austria","Vienna");
        map.put("UK","London");
        map.put("China","Pekin");
        map.put("Ohio","Berlin");

        System.out.println(map.get("Ohio"));
        System.out.println(map);

        Map<Integer,String> list = new HashMap<>();
        list.put(0,"Red");
        list.put(1,"Blue");
        list.put(2,"Red");
        list.put(3,"Blue");
        list.put(4,"Red");
        list.put(5,"Blue");
        list.get(5);

        for(Map.Entry<String,String> entry : map.entrySet()){
            System.out.println(entry.getKey() + " "+entry.getValue());
        }

        for (String v : map.values()){
            System.out.println(v);
        }

        for (String k : map.keySet()) {
            System.out.println(k);
        }

    }
}
