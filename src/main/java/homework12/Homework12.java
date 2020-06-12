package homework12;

//Сделать Enum (или 2 enum)
//Сделать 2 класса - в первом классе поле сделать типа Enum
//Во  втором классе - Поле типа Enum[]
public class Homework12 {
    public static void main(String[] args) {

        Nutrition_parameters_class np_new= new Nutrition_parameters_class(Nutrition_parameters.CALORIES);
        System.out.println(np_new.printInfo());

        Units[] unit = {Units.G};
        Cake black_forest = new Cake("Black Forest", 100, 335, 15, 47, 4,unit);
        System.out.println(black_forest.printInfo());
    }

}
