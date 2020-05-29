package hw11;

public class Work {
    public static void main(String[] args) {
        Bicycle canonade=new Bicycle("Canonade","Mountain Bicycle","Man",3000);
        canonade.printOut();

        System.out.println(" ");

        Bicycle bmw=new Bicycle();
        bmw.setBrand("BMW");
        bmw.setGender("Woman");
        bmw.setType("City Bicycle");
        bmw.setPrice(900);
        bmw.printOut();

        System.out.println("-----------------------------------------------------");

        Cocktails mnht=new Cocktails();
        String[] ing={"Sweet Vermouth,","Angostura Bitters"};
        mnht.setOtherIngredients(ing);
        mnht.setName("Manhattan");
        mnht.setSpirit("Bourbon");
        mnht.setBrandOfSpirit("Bulleit");
        mnht.setGarnish("Cocktail Cherry");
        mnht.setHowPrepared("Stirred");
        mnht.setTypeOfGlass("Rock");
        mnht.setPrice(18);

        mnht.printMe();

        System.out.println(" ");

        String[] ot={"Slice of peeled cucumber,","Mint Leaves,","Agave nectar,","Lime Juice"};
        Cocktails giml=new Cocktails("Cucumber Mint Gimlet","Gin","Hendricks",
                ot,"Lime","Shaken","Collins",21);
        giml.printMe();

        System.out.println("-----------------------------------------------------");

        Exercise squat=new Exercise("Squats","Strength","Legs and Booty");
        squat.printClass();

        System.out.println(" ");

        Exercise zumba=new Exercise();
        zumba.setName("Zumba");
        zumba.setType("Cardio");
        zumba.setPartOfBody("Full Body");
        zumba.printClass();




    }
}
