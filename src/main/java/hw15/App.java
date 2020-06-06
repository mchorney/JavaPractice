package hw15;

public class App {
    public static void main(String[] args) {


        Vitamins bree= new Cheese(15,"Wonderful Bree","Italy",150.45);
        Vitamins daisy= new CottageCheese(9,"Blueberry","large",true);


        Vitamins rokfor= new Cheese(12, "Rokfor","Freach", 450.25);
        Vitamins appleCheese= new CottageCheese(25,"Apple", "medium",false);

       printVitamins(bree);
       printVitamins(daisy);
       printVitamins(rokfor);
       printVitamins(appleCheese);

    }
    static void printVitamins(Vitamins vitamins){
        System.out.println("-----------------------------------------");
        vitamins.vitaminComposition();

    }
}
