package hw11;

public class App {
    public static void main(String[] args) {
//        #1
        String[] hair = {"long", "short", "bold"};
        Dog teddy = new Dog("Teddy", "toy_poodle", hair);
        String[] h = teddy.getHair_type();
        for (String v : h) {
            System.out.println(v);
        }


        Dog raketa = new Dog("Raketa", "pug", hair);
        System.out.println(raketa.getBreed());

        Dog kiki = new Dog("Kiki", "labrador", hair);
        kiki.setName("Mike");


        teddy.printOut();
        raketa.printOut();
        kiki.printOut();

//        #2

        int[] thick = {3, 5, 7};
        Floor hardwood = new Floor("Hardwood", "Brown", thick);
        int[] t = hardwood.getThickness();
        for (int v : t) {
            System.out.println(v);
        }
        Floor lvp = new Floor("LVP", "Black", thick);
        lvp.setColor("Red");
        lvp.setType("linoleum");
        System.out.println(lvp.getType());

        lvp.printout();
        hardwood.printout();

//      #3

        String[] col = {"Red", "Green", "Brown"};
        Fruit apple = new Fruit("Apple", col, "Sour");
        String[] c = apple.getColor();
        for (String v : c) {
            System.out.println(v);
        }
        apple.setName("Antonovka");
        apple.setTaste("Sweet");

        apple.printOut();


        String[] col1 = {"Red", "Green", "Brown"};
        Fruit orange = new Fruit("Orange", col1, "Sweet");
        String[] C = orange.getColor();
        for (String v : C) {
            System.out.println(v);
        }

        orange.printOut();


    }


}

