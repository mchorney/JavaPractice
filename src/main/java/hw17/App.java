package hw17;

/*
Создайте 3 HashMap- <String,String>, <Integer,String> и произвольного класса <Class1,Class2> (придумайте сами)
добавьте в каждый HashMap по 4 элемента
попробуйте методы put/replace/remove/get/foreach
 */

import java.util.HashMap;
import java.util.Map;

public class App {

    public static void main(String[] args) {

        HashMap<String,String> foundation = new HashMap<String, String>();
        foundation.put("Dior","Airflash");
        foundation.put("Tarte", "Amazonia");
        foundation.put("Lancome", "Idol");
        foundation.put("Huda Beauty", "Faex Filter");
        foundation.replace("Huda Beauty", "Liquid Matte");
        foundation.remove("Huda Beauty");
        foundation.get("Dior");
        for (Map.Entry<String,String> entry: foundation.entrySet()){
            System.out.println(entry.getKey() + " " + entry.getValue());
        }

        HashMap<Integer,String> magazines = new HashMap<Integer, String>();
        magazines.put(1,"Cosmopolitan");
        magazines.put(2, "Vogue");
        magazines.put(3, "Marie Claire");
        magazines.put(4, "Elle");
        magazines.replace(3,"Grazia");
        magazines.remove(3);
        magazines.get(2);
        for (String v: magazines.values()){
            System.out.println(v);
        }

        HashMap<Brand,Brush> brushes = new HashMap<Brand, Brush>();
        Brand tarte = new Brand("Tarte", "United States");
        Brush tarteBrush = new Brush("Cheeks", "Pink", 15);
        Brand zoewa = new Brand("Zoewa", "Germany");
        Brush zoewaBrush = new Brush("Eyes", "Golden", 15);
        Brand elf = new Brand("Elf Cosmetics", "United States");
        Brush elfBrush = new Brush("Neck", "White", 8);
        Brand vivienneSabo = new Brand("Vivienne Sabo", "Russia");
        Brush vivienneSaboBrush1 = new Brush("Cheeks", "Black", 5);
        Brush vivienneSaboBrush2 = new Brush("Eyes", "Black", 7);
        brushes.put(tarte, tarteBrush);
        brushes.put(zoewa,zoewaBrush);
        brushes.put(elf, elfBrush);
        brushes.put(vivienneSabo, vivienneSaboBrush1);
        brushes.replace(vivienneSabo, vivienneSaboBrush2);
        brushes.remove(vivienneSabo);
        brushes.get(elf);
        for (Brand k : brushes.keySet()) {
            System.out.println(k.getName());
        }
    }
}
