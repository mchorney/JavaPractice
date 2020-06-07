package hw16;

import java.util.ArrayList;
import java.util.List;

public class Work {
    public static void main(String[] args) {
//        Создайте 3 ArrayList - String, Integer и произвольного класса (придумайте сами)
//        добавьте в каждый ArrayList по 4 элемента
//        попробуйте методы add/set/remove/get/foreach
        ArrayList<String> furniture = new ArrayList<String>();
        furniture.add("Sofa");
        furniture.add("TV");
        furniture.add("Coffee table");
        furniture.add("Book shelf");
        System.out.println(furniture);

        furniture.set(2,"Table");
        System.out.println(furniture);

        furniture.remove("TV");
        System.out.println(furniture);

        System.out.println(furniture.get(0));

        for(String v:furniture){
            System.out.println(v);
        }
        System.out.println("----------------------------------------");

        ArrayList<Integer> highSchool =new ArrayList<>();
        highSchool.add(9);
        highSchool.add(10);
        highSchool.add(11);
        highSchool.add(12);
        System.out.println(highSchool);

        highSchool.set(0,10);
        System.out.println(highSchool);

        highSchool.remove(0);
        System.out.println(highSchool);

        System.out.println(highSchool.get(0));

        for(int v:highSchool){
            System.out.println(v);
        }
        System.out.println("----------------------------------------");

        ArrayList<Wine> wedding = new ArrayList<>();
        Wine sancerre = new Wine(TypeOfWine.STILL,KindOfWine.WHITE,"Sancerre", "Italy",2016);
        Wine minuti = new Wine(TypeOfWine.STILL,KindOfWine.ROSE,"Minuti Cotes de Provence","Portugal",2017);
        Wine moet = new Wine (TypeOfWine.SPARKLING,KindOfWine.CHAMPAGNE,"MOET Chandon Brut","France",2018);
        Wine superTuscan = new Wine(TypeOfWine.STILL,KindOfWine.RED,"Super Tuscan","Italy",2017);
        Wine barossa = new Wine(TypeOfWine.STILL,KindOfWine.RED,"Barossa Cabernet","USA",2018);
        wedding.add(sancerre);
        wedding.add(minuti);
        wedding.add(moet);
        wedding.add(superTuscan);
        System.out.println("All the elements: "+wedding);
        System.out.println("      ");

        wedding.set(3,barossa);
        System.out.println("Change of the element with index 3(Red Wine): "+wedding);
        System.out.println("      ");

        wedding.remove(minuti);
        System.out.println("Rose wine removed: "+wedding);
        System.out.println("      ");

        System.out.println("Element with index 1: "+wedding.get(1));
        System.out.println("      ");

        for(Wine v:wedding){
            System.out.println(v);
        }

    }
}
