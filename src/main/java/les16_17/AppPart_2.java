package les16_17;

import javax.xml.crypto.dsig.keyinfo.KeyValue;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class AppPart_2 {
    public static void main(String[] args) {
        HashMap<String,String>map = new HashMap<String,String>();
        map.put("Germany","Berlin");
        map.put("Ukraine","Kyiv");
        map.put("China","Beijing");
        map.put("Austria","Vienna");
        map.put("UK","London");
       // map.put("China","Pekin"); - the key is always unique
        map.put("Ohio","Berlin");


        System.out.println(map.get("Germany"));
        System.out.println(map);

        Map<Integer,String> list = new HashMap<>();
        list.put(0,"Red");
        list.put(1,"Blue");
        list.put(3,"Pink");
        list.put(4,"Red");
        list.put(5,"Blue");
        list.put(6,"Pink");
        System.out.println(list.get(5));
        System.out.println(list);

         for(Map.Entry<String,String> entry :map.entrySet()){
             System.out.println(entry.getKey()+" "+entry.getValue());
         }
         for(String v:map.values()){
             System.out.println(v);
         }
         for(String k:map.keySet()){
             System.out.println(k);
         }

    }
}
