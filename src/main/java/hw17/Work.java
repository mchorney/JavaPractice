package hw17;

import java.util.HashMap;
import java.util.Map;

public class Work {
    public static void main(String[] args) {
//        Создайте 3 HashMap- <String,String>, <Integer,String> и произвольного класса <Class1,Class2> (придумайте сами)
//        добавьте в каждый HashMap по 4 элемента
//        попробуйте методы put/replace/remove/get/foreach

        Map<String,String> fruitVeg = new HashMap<>();
        fruitVeg.put("Banana","Fruit");
        fruitVeg.put("Potato","Vegetable");
        fruitVeg.put("Watermelon","Berry");
        fruitVeg.put("Apple","Fruit");

        System.out.println(fruitVeg);

        fruitVeg.replace("Banana","Vegetable");
        System.out.println(fruitVeg);

        fruitVeg.remove("Banana");
        System.out.println(fruitVeg);

        System.out.println(fruitVeg.get("Watermelon"));

        System.out.println("   ");
        System.out.println("Keys:");
        System.out.println("   ");
        for(String k: fruitVeg.keySet()){
            System.out.println(k);
        }

        System.out.println("   ");
        System.out.println("Values:");
        System.out.println("   ");
        for(String v: fruitVeg.values()){
            System.out.println(v);
        }

        System.out.println("    ");
        for(Map.Entry<String,String> entry :fruitVeg.entrySet()){
            System.out.println(entry.getKey()+" is a "+entry.getValue());
        }

        System.out.println("----------------------------------------");

        Map<Integer,String> ageTeen = new HashMap<Integer, String>();
        ageTeen.put(2,"Toddler");
        ageTeen.put(4,"PreSchooler");
        ageTeen.put(15,"Teenager");
        ageTeen.put(20,"Young Adult");

        System.out.println(ageTeen);

        ageTeen.replace(4,"Grown Toddler");
        System.out.println(ageTeen);

        ageTeen.remove(4);
        System.out.println(ageTeen);

        System.out.println(ageTeen.get(20));

        System.out.println("   ");
        System.out.println("Keys:");
        System.out.println("   ");
        for(int k: ageTeen.keySet()){
            System.out.println(k);
        }

        System.out.println("   ");
        System.out.println("Values:");
        System.out.println("   ");
        for(String v: ageTeen.values()){
            System.out.println(v);
        }

        System.out.println("    ");
        for(Map.Entry<Integer,String> entry :ageTeen.entrySet()){
            System.out.println(entry.getKey()+" is a "+entry.getValue());
        }

        System.out.println("----------------------------------------");

        Map<Person,Profession> job = new HashMap<>();
        Person alex = new Person("Alex","Pitt",1987);
        Person leon = new Person("Leon", "Professional",1956);
        Person olha = new Person("Olha", "Obertas", 1998);
        Person luisa = new Person("Luisa", "Hay",1976);
        Profession developer = new Profession("Developer",false,5);
        Profession writer = new Profession("Writer", false,10);
        Profession killer = new Profession("Killer",false,30);
        Profession actor = new Profession("Actor",true,20);
        job.put(alex,actor);
        job.put(leon,killer);
        job.put(olha, developer);
        job.put(luisa,writer);
        System.out.println(job);

        job.replace(leon,developer);
        System.out.println(job);

        job.remove(alex);
        System.out.println(job);

        System.out.println(job.get(olha));

        System.out.println("   ");
        System.out.println("Keys:");
        System.out.println("   ");
        for(Person k: job.keySet()){
            System.out.println(k);
        }

        System.out.println("   ");
        System.out.println("Values:");
        System.out.println("   ");
        for(Profession v: job.values()){
            System.out.println(v);
        }

        System.out.println("    ");
        for(Map.Entry<Person,Profession> entry :job.entrySet()){
            System.out.println(entry.getKey()+" is a "+entry.getValue());
        }
    }
}
