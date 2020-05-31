package hw11;

public class Constractor {
    public static void main(String[] args) {
        Resort antalia = new Resort("Turkey", "Qween", 256);
        Resort ukraine = new Resort();
        ukraine.setCountry("Ukraine");
        ukraine.setName("Barvinok");
        ukraine.setPrice(150);

        antalia.printClass();
        System.out.println();
        ukraine.printClass();

        DayOfWeek monday = new DayOfWeek();
        monday.setName("Monday");
        monday.setNumber(1);
        monday.setWeekend(false);

        System.out.println();
        monday.printClass();
        System.out.println();


        String[] listOfGoods = {"Red", "White", "Green"};
        Goods jackets = new Goods("Adidas", "China", 12, listOfGoods);

        jackets.printClass();

        Goods pants = new Goods();
        pants.setCountry("Italy");
        pants.setQuantity(15);
        pants.setTradeName("Versace");
        pants.setListOfGoods(new String[] {"Black","Brown","White"});

        System.out.println();
        pants.printClass();



    }

}
