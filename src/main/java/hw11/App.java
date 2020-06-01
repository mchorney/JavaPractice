package hw11;

public class App {
    public static void main(String[] args) {
//        #1 Dog
        String[] hair = {"long", "short", "bold"};
        Dog teddy = new Dog("Teddy", "toy_poodle", hair);


        Dog raketa = new Dog("Raketa", "pug", hair);
        System.out.println(raketa.getBreed());

        Dog kiki = new Dog("Kiki", "labrador", hair);
        kiki.setName("Mike");


        teddy.printOut();
        raketa.printOut();
        kiki.printOut();

//        #2 Floor

        int[] thick = {3, 5, 7};
        Floor hardwood = new Floor("Hardwood", "Brown", thick);



        Floor lvp = new Floor("LVP", "Black", thick);
        lvp.setColor("Red");
        lvp.setType("linoleum");
        System.out.println(lvp.getType());

        lvp.printout();
        hardwood.printout();

//      #3 Fruit

        String[] col = {"Red", "Green", "Brown"};
        Fruit apple = new Fruit("Apple", col, "Sour");

        apple.setName("Antonovka");
        apple.setTaste("Sweet");

        apple.printOut();


        String[] col1 = {"Red", "Green", "Brown"};
        Fruit orange = new Fruit("Orange", col1, "Sweet");


        orange.printOut();



//        #4 Job
        String[] employees = {"Ronald", "Hanry"};
        Job hr = new Job(employees, "Nik");

        Job qa = new Job(employees, "Margaret");

        hr.printOut();
        qa.printOut();



    }


}

