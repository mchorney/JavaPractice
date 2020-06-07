package l16_17_1;

import java.util.HashMap;

public class App1 {
    public static void main(String[] args) {
        HashMap<String,String> map = new HashMap<String, String>();
        map.put("Germany","Berlin");
        map.put("China","Beijing");
        map.put("Austria","Vienna");
        map.put("UK","London");

        System.out.println(map);
    }
}
