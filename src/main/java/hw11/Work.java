package hw11;

import hw10.Bottle;

public class Work {
    public static void main(String[] args) {

        System.out.println(" ");

        McDonald QTC = new McDonald();
        String[]e={"chicken","beaf","farsh"};
        QTC.setTypeOfBread("regular");
        QTC.setName("quoter pound chease");
        QTC.setTypeOfSalat("regular with pice");
        QTC.setPriceOfBugrgerprice(11);
        QTC.setTypeOfOnion(" = dash");
        QTC.meat(e);
        QTC.printClass();
        System.out.println(" ");

        String[] bb = {"pafer fsih, "+"and meatbread"};
        McDonald bigMac = new McDonald("big mac","regular","special"," = silver",bb,7);
        bigMac.printClass();
        System.out.println(" ");

        Bottle1 coce = new Bottle1("coce"," cocacola","regular");
        coce.printClass2();
        System.out.println(" ");

        Bottle1 fanta = new Bottle1("fanta","cocacola", "70%", "regular");
        fanta.printClass2();
        System.out.println(" ");

        Snake1 anaconda = new Snake1("anaconda","barbara","asian", "pigs","dont have poison",5);
        anaconda.printClass1();
        System.out.println(" ");
        Snake1 king_cobra = new Snake1("cobra", "other snakes","deadly");
        king_cobra.printClass1();
    }

}
