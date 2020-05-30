package lesson_11;
//Сделать 3 класса - в каждом классе по краней мере 3 fields
//Каждый аттрибут имеет setter и getter
//Каждый класс имеет по краней мере 2 конструктора - default и полный (можно больше конструкторов)
//создайте в каждом классе метод printClass() - для вывода всех полей на экран
//По крайней мере один атрибут в одном классе должен быть array
//Создайте в классе Work / main() по крайней мере 2 объекта каждого класса - один полным конструктором, один дефолтовым. Объект созданный дефолтовым конструктором заполните при помощи сеттеров
//Выведите на экран эти объекты функцией printClass() ertyryrtker
public class Homework_11 {
    public static void main(String[] args) {

        String[][] n = {
                {"Serving size = ", "Calories = ", "Fat = ", "Carbs = ", "Protein = "},
                {"100", "335", "15", "47", "4"}
        };
        Cake black_forest = new Cake("Black Forest", "12 servings", n);

        black_forest.printOut();
        System.out.println("-------------------------------------");
        Cake sacher = new Cake();
        sacher.setName("Sacher");
        sacher.setSize("10 servings");
        String[][] n1 = {
                {"Serving size = ", "Calories = ", "Fat = ", "Carbs = ", "Protein = "},
                {"141", "420", "18", "62", "6"}
        };
        sacher.setNutrition_value(n1);
        sacher.printOut();

        System.out.println("**************************************");
        String[] n2 = {"Jan-Feb","Mar-Apr","May-Jun","Jul-Aug","Sep-Oct","Nov-Dec"};
        Magazine architectural_digest = new Magazine("Architectural Digest", "Interior design", n2);
        architectural_digest.printOut();
        System.out.println("-------------------------------------");
        Magazine cosmopolitan = new Magazine();
        cosmopolitan.setName("Cosmopolitan");
        cosmopolitan.setCategory("Fasion and Entertainment");
        String[] n3 = {"Jan","Feb","Mar","Apr","May","Jun","Jul","Aug","Sep","Oct","Nov","Dec"};
        cosmopolitan.setPublication_frequency(n3);
        cosmopolitan.printOut();

        System.out.println("**************************************");
        String[] n4 = {"Two Bedroom Component Suite", "One Bedroom Suite", "Junior Suite", "Business Class Room", "Standard Room", "Economy Room"};
        Hotel radisson = new Hotel("Radisson", "Costa Rica", n4);
        radisson.printOut();
        System.out.println("-------------------------------------");
        Hotel hilton = new Hotel();
        hilton.setName("Hilton");
        hilton.setCountry("USA");
        String[] n5 = {"STUDIO 1 KING BED", "2 KING 2 BEDROOM SUITE WITH SOFABED", "3 KING 3 BEDROOM PREMIER SUITE WITH SOFABED"};
        hilton.setRoom_category(n5);
        hilton.printOut();
    }
}
