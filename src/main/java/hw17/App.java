package hw17;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class App {
    public static void main(String[] args) {




        HashMap<String, String> books = new HashMap<String, String>();
        books.put("Twain", "Tom Soyer");
        books.put("Fitzgerald", "Great Gatsby");
        books.put("Bradbury", "Fahrengeit 451");
        books.put("Kerouak", "On the road");

        System.out.println(books.get("Twain"));

        Set keyset = books.keySet();
        System.out.println("Key set values are: " + keyset);

        books.remove("Kerouak");



            System.out.println(books);

      books.keySet();



        for(Map.Entry b : books.entrySet()) {
            System.out.println(b.getKey() + " " + b.getValue());


            Map<Integer, String> library = new HashMap<>();
            library.put(0, "Tom Sawyer");
            library.put(1, "Great Gatsby");
            library.put(2, "Fahrengeit 451");
            library.put(3, "on the road");

            for (Map.Entry<Integer, String> entry : library.entrySet()) {
                System.out.println(entry.getKey() + " " + entry.getValue());

            }


            for (String v : library.values()) {
                System.out.println(v);
            }

            for (Integer k : library.keySet()) {
                System.out.println(k);
            }

            library.remove(2);
//        for (Map.Entry<Integer, String> entry : library.entrySet()) {
//            System.out.println(entry.getKey() + " " + entry.getValue());
//
//        }

            System.out.println(library.get(3));


            Map<Books, Library> Map = new HashMap<>();
            Library FoxT = new Library("FoxT", 3);
            Library Kids = new Library("KidsLibrary", 7);
            Books Tom = new Books("Tom Sawyer", "Mark Twain");
            Books Road = new Books("On the Road", "James Kerouak");

            Map.put(Tom, Kids);
            Map.put(Road, FoxT);

            FoxT.printInfo();

            FoxT.setRow(2);
            Road.setAuthor("John");
            System.out.println(Map.get(Tom));
            System.out.println(Map.get(Road));

            Map.remove(Tom);


            System.out.println(Map);
        }







    }
}






















