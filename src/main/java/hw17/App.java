package hw17;

import java.util.HashMap;

public class App {
    public static void main(String[] args) {
//        Создайте 3 HashMap- <String,String>, <Integer,String> и произвольного класса <Class1,Class2> (придумайте сами)
//добавьте в каждый HashMap по 4 элемента
//попробуйте методы put/replace/remove/get/foreach

        HashMap<String,String> dogsHashMap = new HashMap<>();
        dogsHashMap.put("Doodle", "Jerry");
        dogsHashMap.put("Poodle", "Teddy");
        dogsHashMap.put("Shiba Inu", "Zoe");
        dogsHashMap.put("German shepherd", "Nik");
        dogsHashMap.put("Colly", "Beast");
        dogsHashMap.put("Rottweiler", "Richi");

        System.out.println(dogsHashMap);
        dogsHashMap.remove("Shiba Inu", "Zoe");
        System.out.println(dogsHashMap);
        dogsHashMap.replace("Doodle", "Jimmy");
        System.out.println(dogsHashMap);
        System.out.println(dogsHashMap.get("Colly"));
        dogsHashMap.forEach((b, n) -> System.out.println(("Breed: " + b + " ;" + " Name: " +n)));
//     -----------------------------------
        HashMap<Integer,String> moviesHashMap = new HashMap<>();
        moviesHashMap.put(2019, "Glass");
        moviesHashMap.put(2020, "Extraction");
        moviesHashMap.put(2010, "Inception");
        moviesHashMap.put(1997, "Titanik");
        moviesHashMap.put(2016, "Moonlight");
        moviesHashMap.put(2019, "After");

        System.out.println(moviesHashMap);
        moviesHashMap.replace(2020, "Platform");
        System.out.println(moviesHashMap);
        moviesHashMap.remove(2016, "Moonlight");
        System.out.println(moviesHashMap);
        System.out.println(moviesHashMap.get(2020));
        moviesHashMap.forEach((y, m) -> System.out.println("Year: " + y + " ;" + " Movie: " +m));
//        ----------------------------------
        Employee danik= new Employee("Danik", "Novoselov");
        Employee nastia = new Employee("Nastia", "Pupkina");
        Employee nikita = new Employee("Nikita", "Solonin");
        Employee zelemhan = new Employee("Zelemhan", "Pylemetchik");
        Employee david = new Employee("David", "Katsal");
        System.out.println(danik);


        Job hr = new Job("HR", 115000);
        Job qa = new Job("QA Engineer", 136000);
        Job cleaner = new Job("House cleaner", 65000);
        Job carpenter = new Job("Carpenter", 80000);
        Job programmer = new Job("Programmer", 163000);

        HashMap<Employee, Job> work = new HashMap<>();
        work.put(danik,carpenter);
        work.put(nikita,qa);
        work.put(zelemhan,hr);
        work.put(david,programmer);
        work.put(nastia,cleaner);


        work.replace(nastia,hr);
        System.out.println(work);
        work.remove(nikita,qa);
        System.out.println(work);
        System.out.println(work.get(nastia).jobInfo());
        work.forEach((p,j) -> System.out.println(p.info() + " " + j.jobInfo()));
    }
}
